package net.hir0shiyt.ElytraCrafting;

import com.mojang.logging.LogUtils;
import net.hir0shiyt.ElytraCrafting.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ElytraMain.MOD_ID)
public class ElytraMain {
    public static final String MOD_ID = "elytracrafting";
    public static final Logger logger = LogUtils.getLogger();

    public ElytraMain() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        System.out.println("Build successful" + logger.toString());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.HALF_ELYTRA);
        }
    }
}
