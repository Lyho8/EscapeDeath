-- Insertion des salles
INSERT INTO room(id, name) VALUES(1, 'A1');
INSERT INTO room(id, name) VALUES(2, 'A2');

-- Insertion des joueurs
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(1, 'Tueur' , false, false, false, 1);
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(2, 'Proie violette' , false, false, false, 2);
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(3, 'Proie bleue' , false, false, false, 1);
INSERT INTO player(id, name, has_played, hidden, dead, current_room_id) VALUES(4, 'Proie verte' , false, false, false, 2);
