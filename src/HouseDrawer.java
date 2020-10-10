
public class HouseDrawer {
	
	public void DrawHouse(House house) {
		if (house.getRooms().size() > 0){
			DrawRoom(house.getRooms().get(0));
		}
	}

	private void DrawRoom(Room room) {
		
	}
}
