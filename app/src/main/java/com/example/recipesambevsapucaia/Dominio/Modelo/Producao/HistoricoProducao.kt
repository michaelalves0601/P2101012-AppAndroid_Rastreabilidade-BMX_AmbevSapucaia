package com.example.recipesambevsapucaia.Dominio.Modelo.Producao

import com.example.recipesambevsapucaia.Dominio.Modelo.Usuario.Usuario
import java.util.*

class HistoricoProducao
(
        var idProducao : Int = 0,
        var Lote : Int = 0,
        var Turno : Int = 0,
        var Produto : Receita = Receita(),
        var idUsuario : Usuario = Usuario(),
        var id : Int = 0
)
{
    var Status : Int = 0
    var DataInicio : Date = Date(1970, 1, 1)
    var DataFim : Date = Date(1970, 1, 1)
}
