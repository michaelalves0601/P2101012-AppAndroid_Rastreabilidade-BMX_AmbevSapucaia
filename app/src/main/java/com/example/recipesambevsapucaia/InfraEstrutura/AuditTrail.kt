package com.example.recipesambevsapucaia.InfraEstrutura

import android.text.GetChars
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