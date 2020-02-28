package co.com.almacen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.almacen.models.Productos;
import co.com.almacen.services.IProductosService;

@RestController
@RequestMapping("/productos")
public class ProductosControllers {

	@Autowired
	IProductosService serv;

	@GetMapping("/lista")
	public List<Productos> Listar() {
		return serv.listar();
	}

	@PostMapping("/grabar")
	public Productos grabar(@RequestBody Productos p) {

		return serv.agregar(p);

	}

	@DeleteMapping("borrar/{id}")
	public void borrar(@PathVariable("id") long id)

	{
		serv.borrar(id);

	}

	@PutMapping("/editar/{id}")
	public Productos editar(@PathVariable long id, @RequestBody Productos p)

	{
		p.setIdProducto(id);

		return serv.editar(p);

	}

}
