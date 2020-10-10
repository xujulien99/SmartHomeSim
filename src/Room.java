import java.util.*;

public class Room {
	private final Wall left, right, top, bottom;
	private final String name;
	private final UUID id;
	
	public Room() {
		name = "Test room";
		id = UUID.randomUUID();
		left = null;
		right = null;
		top = null;
		bottom = null;
	}
	
	public Wall getLeft() {
		return left;
	}

	public Wall getRight() {
		return right;
	}

	public Wall getTop() {
		return top;
	}

	public Wall getBottom() {
		return bottom;
	}

	public String getName() {
		return name;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Room [left=" + left + ", right=" + right + ", top=" + top + ", bottom=" + bottom + ", name=" + name
				+ ", id=" + id + "]";
	}
}
