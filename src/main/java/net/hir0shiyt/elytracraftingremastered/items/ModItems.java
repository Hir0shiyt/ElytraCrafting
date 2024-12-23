package net.hir0shiyt.elytracraftingremastered.items;

import net.hir0shiyt.elytracraftingremastered.ElytraCraftingRemastered;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElytraCraftingRemastered.MODID);

    public static final RegistryObject<Item> HALF_ELYTRA = ITEMS.register("half_elytra",
            () -> new Item(new Item.Properties().stacksTo(2).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("elytracraftingremastered:half_elytra")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
