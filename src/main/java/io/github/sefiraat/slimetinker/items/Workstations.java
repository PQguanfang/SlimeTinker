package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.ModificationStation;
import io.github.sefiraat.slimetinker.items.workstations.repairbench.RepairBench;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryMulti;
import io.github.sefiraat.slimetinker.items.workstations.swappingstation.SwappingStation;
import io.github.sefiraat.slimetinker.items.workstations.table.Table;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Workstations {

    // Tinkers Smeltery
    public static final SlimefunItemStack TINKERS_SMELTERY_CORE =
            ThemeUtils.themedItemStack(
                    "TINKERS_SMELTERY_CORE",
                    Material.CHISELED_POLISHED_BLACKSTONE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "大型冶煉爐〔黏液打鐵〕",
                    "需要岩漿作為燃料，",
                    "將金屬熔化成液體後，",
                    "可以用來製作合金，",
                    "然後利用模具鑄造成指定樣式。"
            );

    // Workbench
    public static final SlimefunItemStack TINKERS_WORKBENCH =
            ThemeUtils.themedItemStack(
                    "TINKERS_WORKBENCH",
                    Material.FLETCHING_TABLE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "合成站〔黏液打鐵〕",
                    "用於製作黏液打鐵的各種物品和零件，",
                    "也可用作增強型工作台。"
            );

    // Table
    public static final SlimefunItemStack TINKERS_TABLE =
            ThemeUtils.themedItemStack(
                    "TINKERS_TABLE",
                    Material.SMITHING_TABLE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "組裝站〔黏液打鐵〕",
                    "將配件組裝成工具或武器"
            );

    // Repair
    public static final SlimefunItemStack TINKERS_REPAIR_BENCH =
            ThemeUtils.themedItemStack(
                    "TINKERS_REPAIR_BENCH",
                    Material.CARTOGRAPHY_TABLE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "維修站〔黏液打鐵〕",
                    "修理工具或武器"
            );

    // Swapping
    public static final SlimefunItemStack TINKERS_SWAPPING_STATION =
            ThemeUtils.themedItemStack(
                    "TINKERS_SWAPPING_STATION",
                    Material.SCAFFOLDING,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "配件更換站〔黏液打鐵〕",
                    "將新配件更換到工具或武器上",
                    "註:綁定結不能替換"
            );

    // Modification
    public static final SlimefunItemStack TINKERS_MOD_STATION =
            ThemeUtils.themedItemStack(
                    "TINKERS_MOD_STATION",
                    Material.GRINDSTONE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "強化站〔黏液打鐵〕",
                    "將工具或武器進行強化",
                    "新增或升級強化項目，將會消耗1次強化次數",
                    "可以利用大量素材提供強化項目經驗"
            );

    protected static final ItemStack[] RECIPE_TINKERS_SMELTERY_MULTI = new ItemStack[] {
            Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,
            Materials.SEARED_TANK,          Materials.SMELTERY_CONTROLLER,  Materials.SPOUT,
            Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK
    };
    protected static final ItemStack[] RECIPE_TINKERS_WORKBENCH = new ItemStack[] {
            new ItemStack(Material.IRON_BLOCK),   new ItemStack(Material.IRON_BLOCK),       new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.OAK_PLANKS),   new ItemStack(Material.CRAFTING_TABLE),   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   new ItemStack(Material.DISPENSER),        new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_TABLE = new ItemStack[] {
            Materials.BLOCK_CAST_STEEL,   Materials.BLOCK_CAST_STEEL,   Materials.BLOCK_CAST_STEEL,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_REPAIR_BENCH = new ItemStack[] {
            Materials.BLOCK_CAST_ALUMINUM,   Materials.BLOCK_CAST_ALUMINUM,   Materials.BLOCK_CAST_ALUMINUM,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_SWAPPING_STATION = new ItemStack[] {
            Materials.BLOCK_CAST_COR_BRONZE,   Materials.BLOCK_CAST_COR_BRONZE,   Materials.BLOCK_CAST_COR_BRONZE,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_MOD_STATION = new ItemStack[] {
            Materials.BLOCK_CAST_REINFORCED,   Materials.BLOCK_CAST_REINFORCED,   Materials.BLOCK_CAST_REINFORCED,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_TABLE,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };


    public static void set(SlimeTinker p) {

        // Setting the workbench to the plugin so during the first tick we can load additional recipes from other plugins
        p.setWorkbench(new Workbench(Categories.WORKSTATIONS, TINKERS_WORKBENCH, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_TINKERS_WORKBENCH));
        p.getWorkbench().register(p);

        new UnplaceableBlock(Categories.WORKSTATIONS, TINKERS_SMELTERY_CORE, DummySmelteryMulti.TYPE, RECIPE_TINKERS_SMELTERY_MULTI).register(p);
        new Table(Categories.WORKSTATIONS, TINKERS_TABLE, Workbench.TYPE, RECIPE_TINKERS_TABLE).register(p);
        new RepairBench(Categories.WORKSTATIONS, TINKERS_REPAIR_BENCH, Workbench.TYPE, RECIPE_TINKERS_REPAIR_BENCH).register(p);
        new SwappingStation(Categories.WORKSTATIONS, TINKERS_SWAPPING_STATION, Workbench.TYPE, RECIPE_TINKERS_SWAPPING_STATION).register(p);
        new ModificationStation(Categories.WORKSTATIONS, TINKERS_MOD_STATION, Workbench.TYPE, RECIPE_TINKERS_MOD_STATION).register(p);

    }


}
