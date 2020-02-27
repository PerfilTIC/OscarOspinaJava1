package co.com.almacen.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.almacen.models.Login;

public interface LoginRepository extends CrudRepository<Login, Long>{

	Login findByUser(String user);
}
