package pe.edu.idat.ef.pablo.burga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.idat.ef.pablo.burga.model.Reserva;
import pe.edu.idat.ef.pablo.burga.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository repositorio;
	

	@Override
	public void guardar(Reserva reserva) {
		repositorio.save(reserva);

	}

	@Override
	public void actualizar(Reserva reserva) {
		repositorio.saveAndFlush(reserva);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Reserva> listar() {
		return repositorio.findAll();
	}

	@Override
	public Reserva obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
