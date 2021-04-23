package Resabev.Software.Domain.Model.User

class PermissoesNoGrupo
(
        val id : Int,
        val idPermissao : Permissoes = Permissoes(),
        val idGrupoUsuario : GrupoUsuario = GrupoUsuario()
)
{
}