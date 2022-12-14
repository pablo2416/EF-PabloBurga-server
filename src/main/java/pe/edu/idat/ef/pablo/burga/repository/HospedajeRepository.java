package pe.edu.idat.ef.pablo.burga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.ef.pablo.burga.model.Hospedaje;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer>{
	
}
