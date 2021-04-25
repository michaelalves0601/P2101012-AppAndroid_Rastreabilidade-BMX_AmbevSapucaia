package Resabev.Software.Domain.Model.Production

import Resabev.Software.Domain.Model.Recipes.Ingrediente


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