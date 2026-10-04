package net.waclap.keu.world

import net.minecraft.world.phys.Vec3

val Vec3.length: Double
    get() = this.length()
val Vec3.lengthSqr: Double
    get() = this.lengthSqr()

operator fun Vec3.plus(other: Vec3): Vec3 = this.add(other)
operator fun Vec3.minus(other: Vec3): Vec3 = this.subtract(other)

operator fun Vec3.times(scale: Double): Vec3 = this.scale(scale)
operator fun Double.times(vec: Vec3): Vec3 = vec.scale(this)

operator fun Vec3.unaryPlus(): Vec3 = this
operator fun Vec3.unaryMinus(): Vec3 = this.reverse()

infix fun Vec3.dot(other: Vec3) = this.dot(other)
infix fun Vec3.cross(other: Vec3) = this.cross(other)