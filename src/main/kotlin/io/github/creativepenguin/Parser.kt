package io.github.creativepenguin

import java.io.File

private fun readFileAsTextUsingInputStream(fname: String) =
    File(fname).inputStream().readBytes().toString(Charsets.UTF_8)

private fun readFileAsLinesUsingBufferedReader(fname: String): List<String> =
    File(fname).bufferedReader().readLines()

enum class ParseModes(isMultiStepScriptCommand: Boolean) {
    LINE(true), IDENT(false), MOVE(true), ROTATE(true), NONE(false)
}

fun parseFile(fname: String, transform: Matrix, edges: Matrix, s: BasicBitmapStorage) {
    var parsemodes = ParseModes.NONE
    for (line in readFileAsLinesUsingBufferedReader(fname)) {
        when (parsemodes) {
            ParseModes.NONE -> {
                parsemodes = ParseModes.valueOf(line.toUpperCase())
                when (parsemodes) {
                    ParseModes.IDENT -> {
                        println("ident")
                    }
                }
            }
            ParseModes.LINE -> {
                println("line")
                parsemodes = ParseModes.NONE
            }
            else -> {
                throw error("Unknown symbol in script file")
            }
        }
    }
}
