package Resabev.Software.Domain.Model.Recipes

class IngredientesNaReceita
(
        val id : Int,
        var idReceita : Receita = Receita(),
        var idIngrediente : Ingrediente = Ingrediente(),
        val Quantidade : Int
)
{
}