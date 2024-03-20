package de.syna.hoechstdigital.demo

import arrow.core.Either
import arrow.core.left

@OptIn(kotlin.js.ExperimentalJsExport::class)
@JsExport
fun main() {
    val rule1 = Rule("Regel 1")
    val rule2 = Rule("Regel 2")

    val either1 = "Wert".left()

    console.log(either1)

    kotlin.js.console.log(processRules(arrayOf(rule1, rule2)))
}
