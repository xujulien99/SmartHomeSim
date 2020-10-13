import java.util.*;

public class House {
	ArrayList<Room> rooms = new ArrayList<Room>();
	//TO REMOVE
	public House() {
		Room room2 = new Room();
		rooms.add(room2);
	}
	
	public House(String houseJson) {
		//build house object from text file
	}

	public ArrayList<Room> getRooms() {
		return new ArrayList<Room>(rooms);
	}
	
	public Room getRoom(Room room) {
		for (Room r : rooms) {
			if(r.getId() == room.getId() && r.getName().equals(room.getName())) {
				return room;
			}
		}
		return null;
	}
	
	public House addRoom(Room room) {
		rooms.add(room);
		return this;
	}
	
	public House removeRoom(Room room) {
		rooms.remove(room);
		return this;
	}
}
