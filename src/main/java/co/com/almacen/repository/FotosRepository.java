package co.com.almacen.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.almacen.models.Fotos;

public interface FotosRepository  extends CrudRepository<Fotos, Long>{
	
	Fotos deleteById(long id);
	Fotos findById(long id);
	
	
	

}
