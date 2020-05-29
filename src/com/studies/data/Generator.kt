package com.studies.data

import com.studies.model.*

fun generate() = ArrayList<Realty>().apply {
    add(
        Flat("Glinki 27", 75f, 3, 134000)
    )
    add(
        Flat(area = 75f, numberOfRooms = 3, price = 134000)
    )
    add(
        Plot("Svetlani 20", 1908900, 180f)
    )
    add(
        Garage("Pirita 8")
    )
    add(
        House("Prosora 391", 1890f, 1_900_000, 201.5f, 13)
    )
    add(
        House("Pros 391", 1890f, 1_900_000, 201.5f, 3)
    )
    add(
        House("Pr 391", 1890f, 1_900_000, 201.5f, 19)
    )
    add(
        Land(3_409_780, 75900.2f)
    )
}
