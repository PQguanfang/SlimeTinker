package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.DummyModificationStation;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Mods {

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_REDSTONE_DUMMY",
                    Material.REDSTONE,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化素材：紅石",
                    ThemeUtils.PASSIVE + "將此強化新增到工具後，",
                    ThemeUtils.PASSIVE + "玩家手持此工具或武器，",
                    ThemeUtils.PASSIVE + "可以獲得相對應強化級數的挖掘加速"
            );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_LAPIS_DUMMY",
                    Material.LAPIS_LAZULI,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化素材：青金石",
                    ThemeUtils.PASSIVE + "將此強化新增到工具後，",
                    ThemeUtils.PASSIVE + "玩家手持此工具或武器，",
                    ThemeUtils.PASSIVE + "會有相當於掠奪與幸運的效果",
                    ThemeUtils.PASSIVE + "每提升1個強化等級，增加10%的效果"
            );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_QUARTZ_DUMMY",
                    Material.QUARTZ,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化素材：石英",
                    ThemeUtils.PASSIVE + "將此強化新增到工具後，",
                    ThemeUtils.PASSIVE + "玩家手持此工具，",
                    ThemeUtils.PASSIVE + "將增加工具或武器的傷害",
                    ThemeUtils.PASSIVE + "每提升1個強化等級，增加20%的效果"
            );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_DIAMOND_DUMMY",
                    Material.DIAMOND,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化素材：鑽石",
                    ThemeUtils.PASSIVE + "將此強化新增到工具後，",
                    ThemeUtils.PASSIVE + "玩家手持此工具，",
                    ThemeUtils.PASSIVE + "受到傷害時有機率對攻擊者產生傷害",
                    ThemeUtils.PASSIVE + "每提升1個強化等級，增加10%的效果"
            );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_EMERALD_DUMMY",
                    Material.EMERALD,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化素材：綠寶石",
                    ThemeUtils.PASSIVE + "將此強化新增到工具後，",
                    ThemeUtils.PASSIVE + "每次動作將會獲得額外的工具經驗或武器經驗",
                    ThemeUtils.PASSIVE + "每提升1個強化等級，增加1工具經驗或10%武器經驗"
            );


    public static final SlimefunItemStack MOD_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "MOD_PLATE_DUMMY",
                    Material.OBSIDIAN,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化素材：黑曜石",
                    ThemeUtils.PASSIVE + "將此強化新增到工具後，",
                    ThemeUtils.PASSIVE + "每提升1個強化等級，增加10%的機率減少工具耐久度",
                    ThemeUtils.PASSIVE + "當此強化等級為10時，該工具就不會消耗耐久度"
            );


    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_REDSTONE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_LAPIS_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_QUARTZ_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_DIAMOND_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_EMERALD_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(Categories.MODIFICATIONS, MOD_PLATE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);

    }
}
