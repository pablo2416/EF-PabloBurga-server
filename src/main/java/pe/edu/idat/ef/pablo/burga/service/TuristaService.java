package pe.edu.idat.ef.pablo.burga.service;

import java.util.List;

import pe.edu.idat.ef.pablo.burga.model.Turista;

public interface TuristaService {
	
	void guardar(Turista turista);
	void actualizar(Turista turista);
	void eliminar(Integer id);
	List<Turista> listar();
	Turista obtener(Integer id);

}
