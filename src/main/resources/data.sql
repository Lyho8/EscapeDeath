-- Insertion des salles
INSERT INTO room(id, name) VALUES(1, 'A1');
INSERT INTO room(id, name) VALUES(2, 'A2');
INSERT INTO room(id, name) VALUES(3, 'A3');
INSERT INTO room(id, name) VALUES(4, 'A4');
INSERT INTO room(id, name) VALUES(5, 'A5');
INSERT INTO room(id, name) VALUES(6, 'B1');
INSERT INTO room(id, name) VALUES(7, 'B2');
INSERT INTO room(id, name) VALUES(8, 'B3');
INSERT INTO room(id, name) VALUES(9, 'B4');
INSERT INTO room(id, name) VALUES(10, 'B5');

-- Insertion des joueurs
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(1, 'Tueur' , false, false, false, 1);
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(2, 'Proie violette' , false, false, false, 2);
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(3, 'Proie bleue' , false, false, false, 1);
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(4, 'Proie verte' , false, false, false, 2);

-- Voisinage des salles
INSERT INTO neighbour_rooms(room1, room2) VALUES (1, 2);
INSERT INTO neighbour_rooms(room1, room2) VALUES (1, 3);
INSERT INTO neighbour_rooms(room1, room2) VALUES (4, 1);
INSERT INTO neighbour_rooms(room1, room2) VALUES (3, 2);
INSERT INTO neighbour_rooms(room1, room2) VALUES (10, 2);
INSERT INTO neighbour_rooms(room1, room2) VALUES (9, 7);
INSERT INTO neighbour_rooms(room1, room2) VALUES (6, 7);
INSERT INTO neighbour_rooms(room1, room2) VALUES (5, 6);
INSERT INTO neighbour_rooms(room1, room2) VALUES (5, 1);
INSERT INTO neighbour_rooms(room1, room2) VALUES (5, 2);
INSERT INTO neighbour_rooms(room1, room2) VALUES (5, 3);
INSERT INTO neighbour_rooms(room1, room2) VALUES (4, 5);
INSERT INTO neighbour_rooms(room1, room2) VALUES (5, 10);
INSERT INTO neighbour_rooms(room1, room2) VALUES (5, 9);
INSERT INTO neighbour_rooms(room1, room2) VALUES (3, 7);
INSERT INTO neighbour_rooms(room1, room2) VALUES (6, 3);
INSERT INTO neighbour_rooms(room1, room2) VALUES (2, 7);
INSERT INTO neighbour_rooms(room1, room2) VALUES (1, 7);
INSERT INTO neighbour_rooms(room1, room2) VALUES (2, 1);
INSERT INTO neighbour_rooms(room1, room2) VALUES (8, 9);
