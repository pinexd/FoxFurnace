package net.piofox4.foxfurnace;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.piofox4.foxfurnace.datagen.ModBlockTagProvider;
import net.piofox4.foxfurnace.datagen.ModLootTableProvider;
import net.piofox4.foxfurnace.datagen.ModModelProvider;
import net.piofox4.foxfurnace.datagen.ModRecipeProvider;

public class FoxFurnaceDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}
}
