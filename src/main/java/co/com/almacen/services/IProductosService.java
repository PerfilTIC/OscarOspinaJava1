package co.com.almacen.services;

import java.util.List;

import co.com.almacen.models.Productos;

public interface IProductosService   {
	
	List<Productos>listar();
	Productos agregar(Productos p);
	Productos editar(Productos p);
	void borrar(Long  id);
	Productos findById(Long id);
	

}
