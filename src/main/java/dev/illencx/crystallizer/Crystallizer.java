package dev.illencx.crystallizer;

import dev.illencx.crystallizer.item.TestItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Crystallizer implements ModInitializer {
    public static final String MOD_ID ="crystallizer";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Item NEWITEM =new TestItem(new Item.Settings().maxCount(64));

    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NEWITEM))
            .displayName(Text.of("crystallizer"))
            .entries((context, entries) -> {
                entries.add(NEWITEM);
            })
            .build();
    @Override
    public void onInitialize() {
        LOGGER.info("onInitialize");
        LOGGER.info(MOD_ID);
        Registry.register(Registries.ITEM, new Identifier("crystallizer", "test_item"), NEWITEM);
        Registry.register(Registries.ITEM_GROUP, new Identifier("crystallizer", "test_group"), ITEM_GROUP);
    }
}
