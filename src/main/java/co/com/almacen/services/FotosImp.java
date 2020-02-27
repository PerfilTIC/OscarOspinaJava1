package co.com.almacen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.almacen.models.Fotos;
import co.com.almacen.repository.FotosRepository;

@Service
public class FotosImp   implements IFotosService{
	
	@Autowired
	private FotosRepository FotosRepository;

	@Override
	public List<Fotos> listar() {
		// TODO Auto-generated method stub
		return (List<Fotos>)FotosRepository.findAll();
	}

	@Override
	public Fotos agregar(Fotos f) {
		// TODO Auto-generated method stub
		return FotosRepository.save(f);
	}

	@Override
	public Fotos editar(Fotos f) {
		// TODO Auto-generated method stub
		return FotosRepository.save(f);
	}

	@Override
	public Fotos borrar(long id) {
		// TODO Auto-generated method stub
		return FotosRepository.deleteById(id);
	}

	@Override
	public Fotos findById(long id) {
		// TODO Auto-generated method stub
		return FotosRepository.findById(id);
	}



	
	

}
