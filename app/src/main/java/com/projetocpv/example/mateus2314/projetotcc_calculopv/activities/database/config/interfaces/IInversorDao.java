package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.interfaces;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.model.Inversor;

import java.util.List;

// Interface com metodos CRUD a ser implementado pelo UsuarioDao

public interface IInversorDao {

    boolean save(Inversor inversor);
    List<Inversor> findAll();

}
