package pe.edu.idat.ef.pablo.burga.service;

import java.util.List;

import pe.edu.idat.ef.pablo.burga.model.Reserva;

public interface ReservaService {

	void guardar(Reserva reserva);
	void actualizar(Reserva reserva);
	void eliminar(Integer id);
	List<Reserva> listar();
	Reserva obtener(Integer id);
}
