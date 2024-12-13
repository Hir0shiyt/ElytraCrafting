package net.hir0shiyt.ElytraCrafting.item;

import net.hir0shiyt.ElytraCrafting.ElytraMain;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElytraMain.MOD_ID);

    public static final RegistryObject<Item> HALF_ELYTRA = ITEMS.register("halfelytra",
            () -> new Item(new Item.Properties().stacksTo(2).craftRemainder(Items.PHANTOM_MEMBRANE).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
