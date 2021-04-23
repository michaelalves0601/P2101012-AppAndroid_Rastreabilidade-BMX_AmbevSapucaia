package com.example.recipesambevsapucaia.Dominio.Modelo.Usuario

class PermissoesNoGrupo
(
        val id : Int,
        val idPermissao : Permissoes = Permissoes(),
        val idGrupoUsuario : GrupoUsuario = GrupoUsuario()
)
{
}