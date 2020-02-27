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

import co.com.almacen.models.Fotos;

import co.com.almacen.services.IFotosService;

@RestController
@RequestMapping("/Fotos")
public class FotosController {

	@Autowired
	private IFotosService iFotosService;

	@GetMapping
	public List<Fotos> Listar() {
		return iFotosService.listar();
	}
	
	@PostMapping("/grabar")
	public Fotos grabar(@RequestBody Fotos f) {

		return iFotosService.agregar(f);

	}
	
	@DeleteMapping("borrar/{id}")
	public Fotos borrar(@PathVariable("id") long id)

	{
		return iFotosService.borrar(id);

	}
	
	@PutMapping("/editar/{id}")
	public Fotos editar(@PathVariable long id, @RequestBody Fotos f)

	{
		f.setIdFoto(id);

		return iFotosService.editar(f);

	}


}
