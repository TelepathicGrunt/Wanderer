package net.itskvant.thewanderer.item.curio.rune;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.UUID;

public class LuckRune extends Item implements ICurioItem{

    public LuckRune(Item.Properties pProperties) {
        super(pProperties);
    }

//    @Override
//    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
//
//        Player player = (Player) livingEntity;
//        player.addEffect(new MobEffectInstance(MobEffects.LUCK, 10, 0,
//                false, false));
//
//        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
//    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> atts = LinkedHashMultimap.create();
        atts.put(Attributes.LUCK, new AttributeModifier(uuid, "luck", 1, AttributeModifier.Operation.ADDITION));
        return atts;
    }

    @Override
    public boolean canRightClickEquip(ItemStack stack) {
        return true;
    }
}
