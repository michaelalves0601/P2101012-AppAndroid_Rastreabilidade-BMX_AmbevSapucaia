package com.example.recipesambevsapucaia.Dominio.Modelo.Producao

import com.example.recipesambevsapucaia.Dominio.Modelo.Usuario.Usuario
import java.util.*

class AuditTrail
(
        val idAuditTrail : Int,
        val Item : Int,
        val ValorAntigo : String,
        val ValorNovo : String,
        var Usuario : Usuario = Usuario(),
        val DataAlteracao : Date,
        val Comentario : String
)
{

}