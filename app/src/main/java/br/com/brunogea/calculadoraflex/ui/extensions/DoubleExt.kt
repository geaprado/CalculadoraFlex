package br.com.brunogea.calculadoraflex.ui.extensions

fun Double.format(digits: Int) =
    java.lang.String.format("%.${digits}f", this)