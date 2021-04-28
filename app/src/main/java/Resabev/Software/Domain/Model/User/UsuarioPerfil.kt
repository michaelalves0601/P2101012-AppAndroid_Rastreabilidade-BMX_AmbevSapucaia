package Resabev.Software.Domain.Model.User

import Resabev.Software.R
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import androidx.databinding.ViewDataBinding

class UsuarioPerfil
(
        var perfil : Usuario,
        val nome : ObservableField<String> = ObservableField(perfil.Nome),
        val cargo : ObservableField<String> = ObservableField(perfil.IdGrupoUsuario.Nome),
        val id : ObservableField<String> = ObservableField(perfil.idCorporativo.toString()),
        val urlImage : ObservableField<String> = ObservableField(perfil.urlImage)
)
{

    fun Refresh(perfil: Usuario)
    {
        this.perfil = perfil;
        nome.set(this.perfil.Nome)
        cargo.set(this.perfil.IdGrupoUsuario.Nome)
        id.set(this.perfil.idCorporativo.toString())
        urlImage.set(this.perfil.urlImage)
    }

    fun ConfigureDataBinding(context: Context, parent: ViewGroup)
    {
        val inflater = LayoutInflater.from(context);
        val ViewDataBinding = DataBindingUtil.inflate<ViewDataBinding>(inflater, R.layout.nav_header_main, parent, false)

    }
}