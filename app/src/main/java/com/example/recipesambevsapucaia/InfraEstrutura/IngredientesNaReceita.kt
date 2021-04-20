package com.example.recipesambevsapucaia.InfraEstrutura

class IngredientesNaReceita
(
    val id : Int,
    var idReceita : Receita = Receita(),
    var idIngrediente : Ingrediente = Ingrediente(),
    val Quantidade : Int
)
{
}