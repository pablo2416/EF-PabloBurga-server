package pe.edu.idat.ef.pablo.burga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.ef.pablo.burga.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
