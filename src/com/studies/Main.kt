package com.studies

import com.studies.data.generate
import com.studies.model.Flat
import com.studies.model.House
import com.studies.model.Land
import com.studies.model.Plot

fun main(args: Array<String>) {
    val list = generate()

    println("Enter number of rooms")
    val inLine = readLine().orEmpty().ifEmpty { "0" }.toInt()
    val outData: String = list.filter { it is House || it is Flat }
        .filter { (it is House && it.numberOfRooms == inLine) }
        .joinToString("\n", "", "\n").ifEmpty { "No Realty had found" }
    println()

    println("Enter max aria of land")
    val maxAriaOfLand = readLine().orEmpty().ifEmpty { "0" }.toFloat()
    println("Enter min aria of land")
    val minAriaOfLand = readLine().orEmpty().ifEmpty { "0" }.toFloat()

    val outLand = list.filter {
        (it is Plot && it.landArea in (minAriaOfLand..maxAriaOfLand))
                || (it is Land && it.landArea in (minAriaOfLand..maxAriaOfLand))
    }
        .joinToString("\n", "", "\n").ifEmpty { "No Realty had found" }
    println(outLand)

    println("Enter address")
    val inAddress = readLine().toString()
    val outRealty = list.filter { it.address?.toLowerCase() == inAddress.toLowerCase() }
        .map { it.toString() }.ifEmpty { "No Realty had found" }

    println(outRealty)
}