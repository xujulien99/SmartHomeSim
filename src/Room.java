import java.util.*;

public class Room {
	private final Wall left, right, top, bottom;
	private final String name;
	private final UUID id;
	
	//TO REMOVE
	public Room() {
		this.name ="asdasdasd";
		this.id = UUID.randomUUID();
		this.left = new WindowWall();
		this.right = new Wall();
		this.top = new WindowWall();
		this.bottom = new Wall();
	}
	
	public Room(String name, Wall left, Wall right, Wall top, Wall bottom, UUID id) {
		this.name = name;
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
		this.id = id;
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
