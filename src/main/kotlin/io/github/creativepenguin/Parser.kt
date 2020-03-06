package io.github.creativepenguin

import java.io.File

private fun readFileAsTextUsingInputStream(fname: String)
    = File(fname).inputStream().readBytes().toString(Charsets.UTF_8)

private fun readFileAsLinesUsingBufferedReader(fname: String): List<String> =
    File(fname).bufferedReader().readLines()

enum class ParseModes {
    line, IDENT("ident"), MOVE("move"), ROTATE("rotate"), DISPLAY("display"), NONE
}

fun parseFile(fname:String) {
    var parsemodes = ParseModes.NONE
    for (line in readFileAsLinesUsingBufferedReader(fname)) {
        if(parsemodes == ParseModes.None) {
            for(val in ParseModes.values()) {
                if()
            }
        }
    }
}
