package io.github.sefiraat.slimetinker.items.componentmaterials.factories;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMForms;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMIdentity;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMToolMakeup;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMTrait;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMTraits;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.enums.TraitEventType;
import io.github.sefiraat.slimetinker.utils.enums.TraitPartType;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class CMLiteXpansion {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.RUBBER,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.RUBBER, Objects.requireNonNull(SlimefunItem.getByID("RUBBER")).getItem(), SkullTextures.ALLOY_BROWN, "#38414d"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                        null,
                                        null,
                                        null,
                                        null,
                                        Objects.requireNonNull(SlimefunItem.getByID("RUBBER")).getId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.RUBBER,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Insulated",
                                                "Become immune to lightning."
                                        ),
                                        null
                                )
                        ));

        map.put(IDStrings.REFINED_IRON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.REFINED_IRON, Objects.requireNonNull(SlimefunItem.getByID("REFINED_IRON")).getItem(), SkullTextures.ALLOY_SILVER, "#ababab"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_REFINED_IRON.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("REFINED_IRON")).getId(),
                                        Materials.BLOCK_CAST_REFINED_IRON.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.REFINED_IRON,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Really Stable",
                                                "Does nothing. Perhaps if you level it up?."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Manners Maketh Man",
                                                "Speed 1, Damage + 50%. Your fights look",
                                                "super cool."
                                        )
                                )
                        ));

        map.put(IDStrings.MIXED_METAL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.MIXED_METAL, Objects.requireNonNull(SlimefunItem.getByID("MIXED_METAL_INGOT")).getItem(), SkullTextures.ALLOY_SILVER, "#6e7a66"),
                                Arrays.asList(
                                        map.get(IDStrings.REFINED_IRON).getLiquidItemStack(3),
                                        CMCore.getMap().get(IDStrings.BRONZE).getLiquidItemStack(3),
                                        CMCore.getMap().get(IDStrings.TIN).getLiquidItemStack(3)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_MIXED_METAL.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("MIXED_METAL_INGOT")).getId(),
                                        Materials.BLOCK_CAST_MIXED_METAL.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.MIXED_METAL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Mixed Metals",
                                                "Has the effects of all it's ingredients but",
                                                "their power is halved."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Stiff",
                                                "Double damage. Unlucky!"
                                        )
                                )
                        ));

        map.put(IDStrings.ADVANCED_ALLOY,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.ADVANCED_ALLOY, Objects.requireNonNull(SlimefunItem.getByID("ADVANCED_ALLOY")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#78aba2"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_ADVANCED_ALLOY.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("ADVANCED_ALLOY")).getId(),
                                        Materials.BLOCK_CAST_ADVANCED_ALLOY.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.ADVANCED_ALLOY,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Cleave",
                                                "Half damage to all nearby entities.",
                                                "Cleave damage does not trigger Tinker's effects."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Heavy Duty",
                                                "When durability gets low, it eats 1 iron",
                                                "ingot from your inventory to restore some."
                                        )
                                )
                        ));

        map.put(IDStrings.THORIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.THORIUM, Objects.requireNonNull(SlimefunItem.getByID("THORIUM")).getItem(), SkullTextures.ALLOY_GREEN, "#33de4d"),
                                null,
                                new CMToolMakeup(false, false, false),
                                new CMForms(
                                        null,
                                        null,
                                        null,
                                        null,
                                        Objects.requireNonNull(SlimefunItem.getByID("THORIUM")).getId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.THORIUM,
                                        null,
                                        null,
                                        null
                                )
                        ));

        map.put(IDStrings.MAG_THOR,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.MAG_THOR, Objects.requireNonNull(SlimefunItem.getByID("MAG_THOR")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#33de4d"),
                                Arrays.asList(
                                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1),
                                        map.get(IDStrings.THORIUM).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.MAGNESIUM).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.ZINC).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_MAG_THOR.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("MAG_THOR")).getId(),
                                        Materials.BLOCK_CAST_MAG_THOR.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.MAG_THOR,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Heat Resistant",
                                                "Lava is no longer your enemy."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Vampirism",
                                                "Chance to heal by damage given.",
                                                "Damage dealt varies by time of day."
                                        )
                                )
                        ));

        map.put(IDStrings.CARBON_MESH,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.CARBON_MESH, Objects.requireNonNull(SlimefunItem.getByID("RAW_CARBON_MESH")).getItem(), SkullTextures.ALLOY_BROWN, "#192927"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                        null,
                                        null,
                                        null,
                                        null,
                                        Objects.requireNonNull(SlimefunItem.getByID("RAW_CARBON_MESH")).getId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.CARBON_MESH,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Nimble",
                                                "Speed 1. Take 33% less damage"
                                        ),
                                        null
                                )
                        ));

        map.put(IDStrings.SCRAP,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SCRAP, Objects.requireNonNull(SlimefunItem.getByID("SCRAP")).getItem(), SkullTextures.ALLOY_BROWN, "#5c451d"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_SCRAP.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("SCRAP")).getId(),
                                        Materials.BLOCK_CAST_SCRAP.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.SCRAP,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Terrible",
                                                "+300% durability loss. 0% Exp Gain."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Brains, Not Brawn.",
                                                "Tool exp gain is doubled. Damage",
                                                "dealt is halved."
                                        )
                                )
                        ));

        map.put(IDStrings.IRIDIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.IRIDIUM, Objects.requireNonNull(SlimefunItem.getByID("IRIDIUM")).getItem(), SkullTextures.ALLOY_PINK, "#c999c9"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_IRIDIUM.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("IRIDIUM")).getId(),
                                        Materials.BLOCK_CAST_IRIDIUM.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.IRIDIUM,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Protective",
                                                "Saves you from deaths. 20min CD."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "Warp",
                                                "Turns your opponent around. 20s CD."
                                        )
                                )
                        ));

        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headCopper);                            // Brains not brawn - Damage             |
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::headCopper);                                 // Brains not brawn - Block Break        | - CO Copper Head
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAdvancedAlloy);           // Cleave
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headMagThor);                      // Heat Resistance
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::headAdvancedAlloy);                  // Heavy Duty
        map.get(IDStrings.RUBBER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindRubber);                       // Insulated
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodRefinedIron);                 // Manners Maketh Man - Damage
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodRefinedIron);                                   // Manners Maketh Man - Tick
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headMixedMetal);                                   // Mixed Metals
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindCarbonMesh);              // Nimble - Player Damage
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindCarbonMesh);                                 // Nimble - Tick
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headIridium);                       // Protective
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headRefinedIron);               // Really Stable
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headBrass);                       // Stiff - Damage                        |
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::headBrass);                                         // Stiff - Tick                          | - CO Brass Head
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headScrap);                                  // Terrible - Durability
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headScrap);                            // Terrible - Damage
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headScrap);                                 // Terrible - Block Break
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headDamsteel);                       // Vampirism                             | - CO DamSteel Head
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodIridium);                          // Warp

    }

}
