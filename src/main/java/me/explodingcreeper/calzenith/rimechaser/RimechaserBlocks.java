package me.explodingcreeper.calzenith.rimechaser;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RimechaserBlocks {

    public static final DeferredRegister<Block>  BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Rimechaser.MODID);

    public static final RegistryObject<Block> ANCIENT_RIME_ORE = BLOCKS.register("ancient_rime", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST)));
}
