/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.objects.items.ceramics;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.dries007.tfc.objects.Metal;
import net.dries007.tfc.util.IFireable;
import net.dries007.tfc.util.IPlacableItem;

public class ItemPottery extends Item implements IPlacableItem, IFireable
{
    @Override
    public ItemStack getFiringResult(ItemStack input, Metal.Tier tier)
    {
        return input; // Already fired pottery does noting.
    }
}
