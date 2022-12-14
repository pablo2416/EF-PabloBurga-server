package pe.edu.idat.ef.pablo.burga.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="hospedaje")
public class Hospedaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedaje;
	private String nombre;
	
	@ManyToMany
	@JoinTable(name="reserva_hospedaje",
	joinColumns = @JoinColumn(name = "id_hospedaje", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_hospedaje) reference hospedaje (id_hospedaje)")),
	inverseJoinColumns = @JoinColumn(name="id_turista", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_turista) references turista (id_turista)"))
	)
	private List<Turista> turista = new ArrayList<>();
}
