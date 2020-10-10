
public class Wall {
	enum WallType {
		WALL,
		ROOM,
		WINDOWS
	}
	
	private WallType type;
	
	public WallType getType() {
		return type;
	}
}
