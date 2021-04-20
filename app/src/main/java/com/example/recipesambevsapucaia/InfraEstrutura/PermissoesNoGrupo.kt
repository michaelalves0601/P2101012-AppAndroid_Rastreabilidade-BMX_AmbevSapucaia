package com.example.recipesambevsapucaia.InfraEstrutura

class PermissoesNoGrupo
(
    val id : Int,
    val idPermissao : Permissoes = Permissoes(),
    val idGrupoUsuario : GrupoUsuario = GrupoUsuario()
)
{
}