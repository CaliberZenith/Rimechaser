package me.explodingcreeper.calzenith.rimechaser;

import me.explodingcreeper.calzenith.rimechaser.common.items.AncientRime;
import me.explodingcreeper.calzenith.rimechaser.common.items.RimeScraps;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RimechaserItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rimechaser.MODID);

    // Items
    public static final RegistryObject<Item> ANCIENT_RIME = ITEMS.register("ancient_rime", AncientRime::new);
    public static final RegistryObject<Item> RIME_SCRAPS = ITEMS.register("rime_scraps", RimeScraps::new);
}
