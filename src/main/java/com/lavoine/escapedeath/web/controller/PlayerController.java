package com.lavoine.escapedeath.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavoine.escapedeath.dao.PlayerDao;
import com.lavoine.escapedeath.model.Player;

import io.swagger.annotations.ApiOperation;

@RestController
public class PlayerController {

	@Autowired
	private PlayerDao playerDao;

	@ApiOperation(value = "Fournit la liste des joueurs")
	@GetMapping(value = "/players", produces = "application/json")
	public List<Player> listeJoueurs(){		
		return playerDao.findAll();
	}
}
