package org.allaymc.randomblockworldgen;

import lombok.extern.slf4j.Slf4j;
import org.allaymc.api.plugin.Plugin;
import org.allaymc.api.registry.Registries;
import org.allaymc.api.world.generator.WorldGenerator;

@Slf4j
public class RandomBlockWorldGen extends Plugin {
    @Override
    public void onLoad() {
        log.info("RandomBlockWorldGen loaded!");
    }

    @Override
    public void onEnable() {
        Registries.WORLD_GENERATOR_FACTORIES.register("RANDOM_BLOCK", preset -> WorldGenerator.builder().name("RANDOM_BLOCK").noisers(new RandomBlockNoiser()).build());
        log.info("RandomBlockWorldGen enabled!");
    }

    @Override
    public void onDisable() {
        log.info("RandomBlockWorldGen disabled!");
    }
}