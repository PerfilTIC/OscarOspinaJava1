package co.com.almacen.services;

import co.com.almacen.models.Categoria;

import java.util.List;

public interface ICategoriaService {

    Categoria findById(Long id);

    List<Categoria> findAll();
}
