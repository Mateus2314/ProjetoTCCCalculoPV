package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.interfaces;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model.Usuario;

import java.util.List;

/**
 * Interface com metodos CRUD a ser implementada pelo UsuarioDao
 */


public interface IUsuarioDao {

    boolean save(Usuario usuario);
    List<Usuario> findAll();

}
