package com.zeta.supernaturalrocksnblocks.item;

import com.zeta.supernaturalrocksnblocks.SupernaturalRocksNBlocks;
import com.zeta.supernaturalrocksnblocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SupernaturalRocksNBlocks.MODID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("supernatural_items_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.IRIDESCENCE.get())).title(Component.translatable("creativetab.supernatural_items_tab")).displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.IRIDESCENCE.get());
                pOutput.accept(ModBlocks.IRIDESCENCE_BLOCK.get());
            }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
