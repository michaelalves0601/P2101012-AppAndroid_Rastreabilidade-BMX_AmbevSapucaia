package com.example.recipesambevsapucaia.InfraEstrutura

class Usuario(
    var idUsuario : Int = 0,
    var idCorporativo : Long = 0,
    var Nome : String = "",
    var IdGrupoUsuario : GrupoUsuario = GrupoUsuario(),
    var Email : String = "",
    var Senha : String = "",
    var Pin : String = ""
)
{

}