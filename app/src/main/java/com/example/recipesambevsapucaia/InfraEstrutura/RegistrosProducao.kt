package com.example.recipesambevsapucaia.InfraEstrutura

class RegistrosProducao
(
    val id : Int,
    var idProducao : HistoricoProducao = HistoricoProducao(),
    var idIngrediente : Ingrediente = Ingrediente(),
    val Quantidade : Int,
    val LinkImagem : String,
    val Lote : String,
    val Validade : String
)
{
}