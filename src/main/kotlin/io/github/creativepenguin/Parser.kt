package io.github.creativepenguin

import java.io.File

private fun readFileAsTextUsingInputStream(fname: String)
    = File(fname).inputStream().readBytes().toString(Charsets.UTF_8)

private fun readFileAsLinesUsingBufferedReader(fname: String): List<String> =
    File(fname).bufferedReader().readLines()

enum class ParseModes {
    LINE, ident, move, rotate, NONE
}

fun parseFile(fname:String) {
    var parsemodes = ParseModes.NONE
    for (line in readFileAsLinesUsingBufferedReader(fname)) {
        when(parsemodes) {
            ParseModes.NONE -> {
                parsemodes = ParseModes.valueOf(line.toUpperCase())

            }
            ParseModes.LINE -> {
                println("line")
                parsemodes = ParseModes.NONE
            }
        }
    }
}
