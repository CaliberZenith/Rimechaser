package me.explodingcreeper.calzenith.rimechaser.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class AncientRime extends Item {

    public AncientRime() {
        super(new Properties()
                .tab(CreativeModeTab.TAB_MISC)
                .fireResistant()
                .rarity(Rarity.UNCOMMON));

    }
}
