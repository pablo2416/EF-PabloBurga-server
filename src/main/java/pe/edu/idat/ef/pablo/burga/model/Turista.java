package pe.edu.idat.ef.pablo.burga.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="turista")
public class Turista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreTurista;
	private String nroCelular;
	private String direccion;

	@ManyToMany(mappedBy = "turista", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Hospedaje> hospedaje =new ArrayList<>();
}
