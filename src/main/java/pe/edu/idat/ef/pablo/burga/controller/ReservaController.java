package pe.edu.idat.ef.pablo.burga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import pe.edu.idat.ef.pablo.burga.model.Reserva;
import pe.edu.idat.ef.pablo.burga.service.ReservaService;

@RestController
@RequestMapping("/reserva/v1")
@AllArgsConstructor
public class ReservaController {

	@Autowired
	private ReservaService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Reserva>> listar(){
		return new ResponseEntity<List<Reserva>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Reserva reserva ){
		service.guardar(reserva);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Reserva> obtenerPorId(@PathVariable Integer id){
		
		Reserva reserva = service.obtener(id);
		
		if( reserva != null) {
			return new ResponseEntity<Reserva>(reserva, HttpStatus.OK);
		}else {
			return new ResponseEntity<Reserva>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Reserva reserva){
		
		Reserva p = service.obtener(null);
		
		if( p != null) {
			service.actualizar(reserva);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		
		Reserva reserva = service.obtener(id);

		if(reserva != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
