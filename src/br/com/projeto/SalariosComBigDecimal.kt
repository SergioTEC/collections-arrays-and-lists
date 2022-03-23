package br.com.projeto

import java.math.BigDecimal

fun SalariosComBigDecimal(){
    val salarios = bigDecimalArrayOf("1500.00", "2000.00" )
    println(salarios.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}
