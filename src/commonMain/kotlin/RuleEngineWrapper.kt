package de.syna.hoechstdigital.demo

@OptIn(kotlin.js.ExperimentalJsExport::class)
@JsExport
data class Rule(
    val rule: String,
)

@OptIn(kotlin.js.ExperimentalJsExport::class)
@JsExport
fun processRules(rules: Array<Rule>): Boolean {
    println(rules)
    return true
}
