package io.github.sefiraat.slimetinker.categories;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;

@UtilityClass
public final class Categories {

    public static final MultiCategory MAIN = new MultiCategory(SlimeTinker.inst().getKeys().getCategoryMain(), new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MAIN),
            ThemeUtils.MAIN + "黏液打铁"
    ));
    public static final SubCategory WORKSTATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryWorkstations(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MAIN),
            ThemeUtils.MAIN + "工作站"
    ));
    public static final SubCategory MATERIALS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryMaterials(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MATERIALS),
            ThemeUtils.MAIN + "材料"
    ));
    public static final SubCategory MOLTEN_METALS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryMolten(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MOLTEN),
            ThemeUtils.MAIN + "金属冶炼"
    ));
    public static final SubCategory ALLOYS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryAlloys(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_ALLOYS),
            ThemeUtils.MAIN + "合金冶炼"
    ));
    public static final SubCategory CASTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryCasts(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_CASTS),
            ThemeUtils.MAIN + "铸造"
    ));
    public static final SubCategory PARTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryParts(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_PARTS),
            ThemeUtils.MAIN + "铸造配件说明(通则)"
    ));
    public static final SubCategory TOOLS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryTools(), MAIN, new CustomItem(
            Material.DIAMOND_SWORD,
            ThemeUtils.MAIN + "工具配装说明"
    ));
    public static final SubCategory TRAITS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryProperties(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_TRAITS),
            ThemeUtils.MAIN + "特性说明"
    ));
    public static final SubCategory MODIFICATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryModifications(), MAIN, new CustomItem(
            Material.REDSTONE,
            ThemeUtils.MAIN + "强化素材说明"
    ));
    public static final SubCategory PART_DICT = new SubCategory(SlimeTinker.inst().getKeys().getCategoryPartDict(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.PART_PICKAXE_HEAD),
            ThemeUtils.MAIN + "铸造配件说明(细则)"
    ));
    public static final DummyCategory DUMMY = new DummyCategory(SlimeTinker.inst().getKeys().getCategoryDummy(), new CustomItem(
            Material.BARRIER,
            ThemeUtils.MAIN + "SlimeTinker Dummy (作者未完成)"
    ));

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        MOLTEN_METALS.register(p);
        ALLOYS.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        TRAITS.register(p);
        MODIFICATIONS.register(p);
        PART_DICT.register(p);
    }

}
