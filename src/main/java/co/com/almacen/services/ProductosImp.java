package co.com.almacen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.almacen.models.Productos;
import co.com.almacen.repository.ProductosRepository;

@Service

public class ProductosImp implements IServiceProductos {

	@Autowired

	private ProductosRepository repo;

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return (List<Productos>) repo.findAll();
	}

	@Override
	public Productos agregar(Productos p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Productos editar(Productos p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Productos borrar(long id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}

	@Override
	public Productos findById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

}
