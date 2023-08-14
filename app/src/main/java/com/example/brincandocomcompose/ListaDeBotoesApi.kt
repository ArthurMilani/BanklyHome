package com.example.brincandocomcompose

data class BotaoApi(val iconId: Int, val text: String)


object ButtonList{
    val buttonList = listOf<BotaoApi>(
        BotaoApi(R.drawable.ic_pix, "Pix"),
        BotaoApi(R.drawable.ic_transf, "Transferência"),
        BotaoApi(R.drawable.ic_pagamento, "Pagar Conta"),
        BotaoApi(R.drawable.ic_phisical_card, "Cartão Físico"),
        BotaoApi(R.drawable.ic_virtual_card, "Cartão Virtual"),
        BotaoApi(R.drawable.ic_charge, "Cobrança"),
        BotaoApi(R.drawable.ic_cobrancas, "Comprovantes"),
        BotaoApi(R.drawable.ic_add_money, "Adicionar Saldo"),
        BotaoApi(R.drawable.ic_add_money, "Adicionar Saldo"),
        BotaoApi(R.drawable.ic_add_money, "Adicionar Saldo")
    )

}


object AgrupadorDeBotoes{

    fun agrupadorDeBotoes(buttonList: List<BotaoApi>): MutableList<MutableList<BotaoApi>>{
        val listaAgrupada = mutableListOf<MutableList<BotaoApi>>()
        val resto = buttonList.size % 4  //Numero de botões na última linha, caso não sejam múltiplos de 4
        val ultimaIteracaoComResto = (buttonList.size / 4) + 1  //Número total de iterações no próximo "for"
        var iteracaoAtual = 0  //Variável que armazenará em qual iteração está

        for(index in buttonList.indices step 4){
            iteracaoAtual = (index/4)+1
            if(resto == 0 || iteracaoAtual < ultimaIteracaoComResto) {
                listaAgrupada.add(
                    mutableListOf(
                        buttonList[index],
                        buttonList[index + 1],
                        buttonList[index + 2],
                        buttonList[index + 3]
                    )
                )
            }
            else{
                val ultimoElemento = mutableListOf<BotaoApi>()
                for(i in 0 until resto){
                    ultimoElemento.add(buttonList[index + i])
                }
                listaAgrupada.add(ultimoElemento)
            }
        }
        return listaAgrupada
    }

}