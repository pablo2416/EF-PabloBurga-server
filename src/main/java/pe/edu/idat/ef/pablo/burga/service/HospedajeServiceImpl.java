package pe.edu.idat.ef.pablo.burga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.idat.ef.pablo.burga.model.Hospedaje;
import pe.edu.idat.ef.pablo.burga.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	
	@Autowired
	private HospedajeRepository repositorio;

	@Override
	public void guardar(Hospedaje hospedaje) {
		repositorio.save(hospedaje);

	}

	@Override
	public void actualizar(Hospedaje hospedaje) {
		repositorio.saveAndFlush(hospedaje);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Hospedaje> listar() {
		return repositorio.findAll();
	}

	@Override
	public Hospedaje obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
