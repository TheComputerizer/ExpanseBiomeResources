package expansebiomeresource.mod.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeEnceladusCrater extends Biome {

    public BiomeEnceladusCrater() {

        super(new BiomeProperties("Enceladus Valley").setBaseHeight(0.7f).setHeightVariation(0.1f).setRainfall(0.0f).setRainDisabled().setTemperature(0.7f));

        topBlock = Blocks.PACKED_ICE.getDefaultState();
        fillerBlock = Blocks.STONE.getDefaultState();
        this.decorator.generateFalls = false;
        this.decorator.deadBushPerChunk = 0;
        this.decorator.cactiPerChunk = 0;
        this.decorator.treesPerChunk = 0;
        this.decorator.extraTreeChance = 0.0f;
        this.decorator.flowersPerChunk = 0;
        this.decorator.grassPerChunk = 0;
        this.decorator.gravelPatchesPerChunk = 0;
        this.decorator.mushroomsPerChunk = 0;
        this.decorator.reedsPerChunk = 0;
        this.decorator.waterlilyPerChunk = 0;
    }
}
