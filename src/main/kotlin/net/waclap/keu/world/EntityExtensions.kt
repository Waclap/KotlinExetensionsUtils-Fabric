package net.waclap.keu.world

import net.minecraft.core.Holder
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.ai.attributes.Attribute
import net.minecraft.world.phys.Vec3

val Entity.position: Vec3
    get() = this.position()

fun LivingEntity.getAttributeValueOrDefault(attribute: Holder<Attribute>): Double {
    return getAttributeValueOrDefault(attribute, attribute.value().defaultValue)
}

fun LivingEntity.getAttributeValueOrDefault(attribute: Holder<Attribute>, defaultValue: Double): Double {
    return this.getAttribute(attribute)?.value ?: defaultValue
}