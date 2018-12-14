package com.lavoine.escapedeath.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lavoine.escapedeath.model.Player;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer> {

}
