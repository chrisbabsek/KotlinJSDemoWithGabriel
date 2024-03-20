package de.syna.hoechstdigital.demo

@OptIn(kotlin.js.ExperimentalJsExport::class)
@JsExport
fun main() {
    val rule1 = Rule("Regel 1")
    val rule2 = Rule("Regel 2")

    kotlin.js.console.log(processRules(arrayOf(rule1, rule2)))
}
