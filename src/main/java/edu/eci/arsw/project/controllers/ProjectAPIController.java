package edu.eci.arsw.project.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.eci.arsw.project.service.CreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.project.service.ProjectService;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/project")
public class ProjectAPIController {

	@Autowired
	ProjectService ps = null;
	@Resource(name = "creatorService")
	CreatorService cs;

	
	@RequestMapping(path="/room/{code}", method=RequestMethod.GET)
	public ResponseEntity<?> getRoomName(@PathVariable ("code") String roomCode) {
		try {
			return new ResponseEntity<>("Sala de Prueba", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			Logger.getLogger(ProjectAPIController.class.getName()).log(Level.SEVERE, null, e);
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path="/topic", method = RequestMethod.GET)
	public ResponseEntity<> getAllTopics(){
		return new ResponseEntity<>(cs.getAllTopics(), HttpStatus.ACCEPTED);
	}

}