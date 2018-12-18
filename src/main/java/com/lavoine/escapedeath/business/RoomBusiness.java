package com.lavoine.escapedeath.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavoine.escapedeath.dao.RoomDao;
import com.lavoine.escapedeath.model.Player;
import com.lavoine.escapedeath.model.Room;

@Service
public class RoomBusiness {
	@Autowired
	RoomDao roomDao;

	public List<Room> listerSalles() {
		return roomDao.findAll();
	}

	public List<Player> listerJoueurs(int id) {
		return roomDao.findById(id).get().getLocalPlayers();
	}

	public List<Player> listerJoueursVisibles(int id) {
		List<Player> players = roomDao.findById(id).get().getLocalPlayers();

		players.removeIf(p -> p.isHidden());

		return players;
	}

	public List<Player> listerJoueursCaches(int id) {
		List<Player> players = roomDao.findById(id).get().getLocalPlayers();

		players.removeIf(p -> !p.isHidden());

		return players;
	}
}
