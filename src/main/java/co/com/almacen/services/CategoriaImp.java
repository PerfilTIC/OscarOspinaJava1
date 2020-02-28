package co.com.almacen.services;

import co.com.almacen.models.Categoria;
import co.com.almacen.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaImp implements ICategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }
}
