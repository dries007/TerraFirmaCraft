/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.objects.items.rock;

import java.util.EnumMap;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.dries007.tfc.objects.Rock;
import net.dries007.tfc.util.OreDictionaryHelper;

public class ItemRock extends Item
{
    private static final EnumMap<Rock, ItemRock> MAP = new EnumMap<>(Rock.class);

    public static ItemRock get(Rock rock)
    {
        return MAP.get(rock);
    }

    public static ItemStack get(Rock rock, int amount)
    {
        return new ItemStack(MAP.get(rock), amount);
    }

    public final Rock ore;

    public ItemRock(Rock rock)
    {
        this.ore = rock;
        if (MAP.put(rock, this) != null) throw new IllegalStateException("There can only be one.");
        setMaxDamage(0);
        OreDictionaryHelper.register(this, "rock");
        OreDictionaryHelper.register(this, "rock", rock);
        OreDictionaryHelper.register(this, "rock", rock.category);
    }
}
