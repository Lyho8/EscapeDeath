package com.lavoine.escapedeath.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavoine.escapedeath.dao.RoomDao;
import com.lavoine.escapedeath.model.Room;

import io.swagger.annotations.ApiOperation;

@RestController
public class RoomController {

	@Autowired
	private RoomDao RoomDao;

	@ApiOperation(value = "Fournit la liste des salles")
	@GetMapping(value = "/rooms", produces = "application/json")
	public List<Room> listerSalles() {
		return RoomDao.findAll();
	}
}
