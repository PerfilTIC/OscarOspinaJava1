package co.com.almacen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sun.xml.bind.v2.model.core.ID;

import co.com.almacen.models.Productos;

@Repository

public interface ProductosRepository extends CrudRepository<Productos, ID> {

	

	Productos findById(long id);

	Productos deleteById(long id);
}
