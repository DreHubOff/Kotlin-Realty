package com.studies.model


abstract class Realty(val address: String?) {
    override fun toString(): String {
        return if (!address.isNullOrEmpty()) {
            "\tAddress = $address"
        } else {""}
    }
}

class Garage(address: String? = null) : Realty(address)

open class Land(
    val price: Int,
    val landArea: Float
) : Realty(null) {
    override fun toString() = "Price = $price, land area = $landArea"
}


open class Plot(
    address: String?,
    val price: Int,
    val landArea: Float
) : Realty(address) {
    override fun toString() = "${super.toString()}, prise = $price, land area = $landArea"
}


open class House(
    address: String?,
    landArea: Float,
    price: Int,
    val area: Float,
    val numberOfRooms: Int
) : Plot(address, price, landArea) {
    override fun toString() = "${super.toString()}, area = $area, number of rooms = $numberOfRooms;"
}


class Flat(
    address: String? = null,
    area: Float,
    numberOfRooms: Int,
    price: Int
) : House(address, 0f, price, area, numberOfRooms) {
    override fun toString():String {
        if (address.isNullOrEmpty())return "\tArea = $area, number of rooms = $numberOfRooms, price = $price;"
        return "\tAddress = $address, area = $area, number of rooms = $numberOfRooms, price = $price;"
}}
