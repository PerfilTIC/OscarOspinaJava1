package co.com.almacen.services;

import java.util.List;

import co.com.almacen.models.Productos;

public interface IServiceProductos   {
	
	List<Productos>listar();
	Productos agregar(Productos p);
	Productos editar(Productos p);
	Productos borrar(long  id);
	Productos findById(long id);
	

}
