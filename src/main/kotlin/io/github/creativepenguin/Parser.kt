package io.github.creativepenguin

import java.io.File

private fun readFileAsTextUsingInputStream(fname: String)
    = File(fname).inputStream().readBytes().toString(Charsets.UTF_8)

private fun readFileAsLinesUsingBufferedReader(fname: String): List<String>
    = File(fname).bufferedReader().readLines()

enum class Mode {
    LINE, IDENT, MOVE, ROTATE, DISPLAY
}

fun parseFile(fname:String) {
    for(line in readFileAsLinesUsingBufferedReader(fname)) {

    }
}