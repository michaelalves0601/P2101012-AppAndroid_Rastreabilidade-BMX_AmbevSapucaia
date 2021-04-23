package com.example.recipesambevsapucaia.Dominio.Modelo.Usuario

import java.util.*

class Dispositivo
(
    val idDispositivo : Int,
    val Modelo : String,
    val Tipo : String,
    val UnidadeAtiva : String
)
{
    var UltimoUsuario : Usuario = Usuario()
    var ModoDark : Boolean = false
    var StatusLicenca : Boolean = false
    var Localizacao : String = ""
    var UltimaConexao : Date = Date(1970, 1, 1)
    var Bateria : Int = 0
}