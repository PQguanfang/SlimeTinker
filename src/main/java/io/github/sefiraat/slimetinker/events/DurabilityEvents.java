package io.github.sefiraat.slimetinker.events;

import io.github.sefiraat.slimetinker.utils.ItemUtils;
import lombok.experimental.UtilityClass;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public final class DurabilityEvents {

    public static void rodAluBronze(DurabilityEventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }

    public static void headSolder(DurabilityEventFriend friend) {
        ItemMeta im = friend.getHeldItem().getItemMeta();
        assert im != null;
        Damageable damageable = (Damageable) im;
        damageable.setDamage(friend.getHeldItem().getType().getMaxDurability() - 1);
        friend.getHeldItem().setItemMeta(im);
        friend.getEvent().setCancelled(true);
    }

    public static void headAluminum(DurabilityEventFriend friend) {
        if (ThreadLocalRandom.current().nextInt(1,4) == 1) {
            ItemUtils.incrementRepair(friend.getHeldItem(), 1);
            friend.getEvent().setCancelled(true);
        }
    }

    public static void rodAluminum(DurabilityEventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }

    public static void explosive(DurabilityEventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 17);
    }

    public static void headSingInfinity(DurabilityEventFriend friend) {
        friend.setDurabilityMod(0);
    }

    public static void headMythril(DurabilityEventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 0.5);
    }

    public static void headInfinity(DurabilityEventFriend friend) {
        friend.setDurabilityMod(0);
    }

    public static void headSingAluminum(DurabilityEventFriend friend) {
        if (ThreadLocalRandom.current().nextInt(1,4) == 1) {
            ItemUtils.incrementRepair(friend.getHeldItem(), 2);
            friend.getEvent().setCancelled(true);
        }
    }

    public static void rodSingAluminum(DurabilityEventFriend friend) {
        friend.setDurabilityMod(friend.getDurabilityMod() + 1);
    }
}
