package com.lavoine.escapedeath.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Player {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private boolean hasPlayed;
	
	private boolean hidden;
	
	private boolean dead;
	
	@ManyToOne
	@JoinColumn(name = "current_room_id")
	@JsonIgnore
	@NotNull
	private Room currentRoom;
	
	@Transient
	private int currentRoomId;
	
	public int getCurrentRoomId() {
		return currentRoom.getId();
	}
}
