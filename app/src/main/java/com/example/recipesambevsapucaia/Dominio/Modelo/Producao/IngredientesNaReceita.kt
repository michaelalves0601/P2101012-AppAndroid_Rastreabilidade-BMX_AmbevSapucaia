package com.example.recipesambevsapucaia.Dominio.Modelo.Producao

class IngredientesNaReceita
(
        val id : Int,
        var idReceita : Receita = Receita(),
        var idIngrediente : Ingrediente = Ingrediente(),
        val Quantidade : Int
)
{
}