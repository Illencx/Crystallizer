package dev.illencx.crystallizer;

import dev.illencx.crystallizer.item.TestItem;
import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static dev.illencx.crystallizer.constant.CrystallizerConstant.MOD_ID;
import static dev.illencx.crystallizer.constant.CrystallizerConstant.NAME_SPACE;

/**
 * @author Illencx
 * @Date 2024/2/27
 * @version 1.0.0
 */

@Slf4j
public class Crystallizer implements ModInitializer {
    public static final Item NEWITEM = new TestItem(new Item.Settings().maxCount(64));

    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NEWITEM))
            .displayName(Text.of(NAME_SPACE))
            .entries((context, entries) -> entries.add(NEWITEM))
            .build();

    @Override
    public void onInitialize() {
        log.info("onInitialize, mod id : {}", MOD_ID);
        Registry.register(Registries.ITEM, new Identifier(NAME_SPACE, "test_item"), NEWITEM);
        Registry.register(Registries.ITEM_GROUP, new Identifier(NAME_SPACE, "test_group"), ITEM_GROUP);
    }
}
