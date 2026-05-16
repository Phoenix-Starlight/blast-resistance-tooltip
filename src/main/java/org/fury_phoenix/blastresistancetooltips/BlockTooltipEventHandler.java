package org.fury_phoenix.blastresistancetooltips;

import net.minecraft.item.ItemBlock;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class BlockTooltipEventHandler {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void blastResistanceTooltip(ItemTooltipEvent event) {
        if (event.getFlags().isAdvanced() && event.getItemStack().getItem() instanceof ItemBlock)
            event.getToolTip().add(TextFormatting.GRAY + "Blast Resistance: " + ((ItemBlock) event.getItemStack().getItem()).getBlock().getExplosionResistance(null));
    }
}
