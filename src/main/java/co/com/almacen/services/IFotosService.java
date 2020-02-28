package co.com.almacen.services;

import java.util.List;

import co.com.almacen.models.Fotos;




public interface IFotosService  {
	
	

	List<Fotos>listar();
	Fotos agregar(Fotos f);
	Fotos editar(Fotos p);
	void borrar(long  id);
	Fotos findById(long id);
	

}
