package me.explodingcreeper.calzenith.rimechaser.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class RimeScraps extends Item {

    public RimeScraps() {
        super(new Properties()
                .tab(CreativeModeTab.TAB_MISC)
                .rarity(Rarity.COMMON));
    }

}
