package Resabev.Software.Domain.Model

import Resabev.Software.Domain.Model.User.Usuario
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