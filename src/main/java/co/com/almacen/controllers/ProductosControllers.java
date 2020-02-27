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
import co.com.almacen.services.IServiceProductos;

@RestController
@RequestMapping("/almacen")

public class ProductosControllers {

	@Autowired
	IServiceProductos serv;

	@GetMapping
	public List<Productos> Listar()

	{

		return serv.listar();

	}

	@PostMapping("/save")
	public Productos save(@RequestBody Productos p) {

		return serv.agregar(p);

	}

	@DeleteMapping("borrar/{id}")
	public Productos borrar(@PathVariable("id") long id)

	{

		return serv.borrar(id);

	}

	@PutMapping("/update/{id}")
	public Productos editar(@PathVariable long id, @RequestBody Productos p)

	{
		p.setId(id);

		return serv.editar(p);

	}

}
