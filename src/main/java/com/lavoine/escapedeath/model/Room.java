package com.lavoine.escapedeath.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Room {
	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private String name;

	@OneToMany(mappedBy = "currentRoom", cascade = CascadeType.ALL)
	private List<Player> localPlayers;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "neighbour_rooms", joinColumns = { @JoinColumn(name = "room2") }, inverseJoinColumns = {
			@JoinColumn(name = "room1") })
	@JsonIgnore
	private List<Room> rooms1;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "neighbour_rooms", joinColumns = { @JoinColumn(name = "room1") }, inverseJoinColumns = {
			@JoinColumn(name = "room2") })
	@JsonIgnore
	private List<Room> rooms2;

	@Transient
	private List<Integer> neighbourRooms;

	public List<Integer> getNeighbourRooms() {
		List<Integer> result = new ArrayList<Integer>();

		for (Room r : rooms1) {
			int i = r.getId();
			if (i != this.id) {
				result.add(i);
			}
		}

		for (Room r : rooms2) {
			int i = r.getId();
			if (i != this.id) {
				result.add(i);
			}
		}

		// Suppression des redondances si nécessaire
		Set<Integer> set = new HashSet<Integer>(result);
		result.clear();
		result.addAll(set);

		Collections.sort(result);

		return result;
	}
}
