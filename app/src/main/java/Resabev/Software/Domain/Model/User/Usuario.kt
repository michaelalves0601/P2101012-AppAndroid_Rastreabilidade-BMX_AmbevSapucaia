package Resabev.Software.Domain.Model.User

class Usuario(
        var idUsuario : Int = 0,
        var idCorporativo : Long = 0,
        var Nome : String = "",
        var IdGrupoUsuario : GrupoUsuario = GrupoUsuario(),
        var Email : String = "",
        var urlImage : String = "",
        var Senha : String = "",
        var Pin : String = ""
)
{

}