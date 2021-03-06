package com.lavoine.escapedeath.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lavoine.escapedeath.model.Room;

@Repository
public interface RoomDao extends JpaRepository<Room, Integer> {

}
