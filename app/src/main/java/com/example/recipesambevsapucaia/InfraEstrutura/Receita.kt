package com.example.recipesambevsapucaia.InfraEstrutura

import java.time.*
import java.util.*

class Receita
(
    var idReceita : Int = 0,
    var Produto : String = "",
    var Autor : Usuario = Usuario(),
    var DataRegistro : Date = Date(1970, 1, 1),
    var idMarca : Marca = Marca()
    )
{
    var Status : Boolean = false
    var AprovadoPor : Usuario = Usuario()
    var Arquivado : Boolean = false
    var Versao : Int = 0
    var VersaoAtiva : Boolean = false
    var LinkImagemProduto : String = ""
}