import java.util.*;

public class House {
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	public House(String houseJson) {
		rooms.add(new Room());
		rooms.add(new Room());
		rooms.add(new Room());
		rooms.add(new Room());
		rooms.add(new Room());
	}

	public ArrayList<Room> getRooms() {
		return new ArrayList<Room>(rooms);
	}
	
//	public Room getRoom(Room room) {
//		for (Room r : rooms) {
//		}
//	}
	
	public House addRoom(Room room) {
		rooms.add(room);
		return this;
	}
	
	public House removeRoom(Room room) {
		rooms.remove(room);
		return this;
	}
}
