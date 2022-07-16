package net.bokicks283.fabrictransportationmod.item;

import net.bokicks283.fabrictransportationmod.FabricTransportationMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BASIC_CAR = registerItem("basic_car", 
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FabricTransportationMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        FabricTransportationMod.LOGGER.info("Registering Items for " + FabricTransportationMod.MOD_ID);
    }
}