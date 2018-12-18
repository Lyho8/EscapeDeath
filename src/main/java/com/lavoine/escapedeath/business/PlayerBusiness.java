package com.lavoine.escapedeath.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavoine.escapedeath.dao.PlayerDao;
import com.lavoine.escapedeath.dao.RoomDao;
import com.lavoine.escapedeath.model.Player;
import com.lavoine.escapedeath.model.Room;
import com.lavoine.escapedeath.web.exceptions.CustomException;

@Service
public class PlayerBusiness {
	@Autowired
	PlayerDao playerDao;

	@Autowired
	RoomDao roomDao;

	public List<Player> listerJoueurs() {
		return playerDao.findAll();
	}

	public Player nePasBouger(int id) {
		Player p = playerDao.findById(id).get();

		p.setHasPlayed(true);
		playerDao.save(p);

		return p;
	}

	public Player changerStatutCache(int id) {
		Player p = playerDao.findById(id).get();

		p.setHidden(!p.isHidden());
		p.setHasPlayed(true);
		playerDao.save(p);

		return p;
	}

	public Player seDeplacer(int id, int roomId) {
		Player p = playerDao.findById(id).get();
		Room r = roomDao.findById(roomId).get();

		if (!p.getCurrentRoom().getNeighbourRooms().contains(roomId)) {
			throw new CustomException("Le joueur " + p.getName() + " ne peut se déplacer vers la salle " + r.getName()
					+ " depuis la salle " + p.getCurrentRoom().getName());
		}

		p.setCurrentRoom(r);
		playerDao.save(p);

		return p;
	}
}
