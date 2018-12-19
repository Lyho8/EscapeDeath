package com.lavoine.escapedeath.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lavoine.escapedeath.business.RoomBusiness;
import com.lavoine.escapedeath.model.Player;
import com.lavoine.escapedeath.model.Room;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoomController {

	@Autowired
	private RoomBusiness business;

	@ApiOperation(value = "Fournit la liste des salles")
	@GetMapping(value = "/rooms", produces = "application/json")
	public List<Room> listerSalles() {
		return business.listerSalles();
	}

	@ApiOperation(value = "Fournit la liste des joueurs présents dans la salle (sans filtre)")
	@GetMapping(value = "/room/{id}/players", produces = "application/json")
	public List<Player> listerJoueurs(@PathVariable int id) {
		return business.listerJoueurs(id);
	}

	@ApiOperation(value = "Fournit la liste des joueurs présents et visibles dans la salle")
	@GetMapping(value = "/room/{id}/visibleplayers", produces = "application/json")
	public List<Player> listerJoueursVisibles(@PathVariable int id) {
		return business.listerJoueursVisibles(id);
	}

	@ApiOperation(value = "Fournit la liste des joueurs présents et cachés dans la salle")
	@GetMapping(value = "/room/{id}/hiddenplayers", produces = "application/json")
	public List<Player> listerJoueursCaches(@PathVariable int id) {
		return business.listerJoueursCaches(id);
	}
}
