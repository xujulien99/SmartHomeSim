import java.awt.*;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.*;

public class HouseDrawer extends JPanel{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;
	ArrayList<UUID> visitedRooms = new ArrayList<UUID>();
	House house;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		DrawHouse(g);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(WIDTH, HEIGHT);
	}
	
	public HouseDrawer(House home) {
		this.house = home;
	}
	
	public Graphics DrawHouse(Graphics g) {
		if (house.getRooms().size() > 0){
			g = DrawRoom(house.getRooms().get(0), 500, 500, g);
		}
		g.drawLine(400, 400, 100, 30);
		return g;
	}

	private Graphics DrawRoom(Room room, int xCoord, int yCoord, Graphics g) {
//		visitedRooms.add(room.getId());
//		g = DrawWall(room.getLeft(), "left", xCoord, yCoord, g);
//		g = DrawWall(room.getRight(), "right", xCoord, yCoord, g);
//		g = DrawWall(room.getBottom(), "bottom", xCoord, yCoord, g);
//		g = DrawWall(room.getTop(), "top", xCoord, yCoord, g);
		
		g.drawRect(500, 500, 100, 50);
		
		return g;
	}
	
	public Graphics DrawWall(Wall wall, String direction, int xCoord, int yCoord, Graphics g) {
		if (wall.getType() == WallType.WALL) {
			if (direction.equals("top") || direction.equals("bottom")) {
				//draw horizontal line
				return g;
			}
			if (direction.equals("left") || direction.equals("right")) {
				//draw vertical line
				return g;
			}
		}
		
		else if (wall.getType() == WallType.WINDOWS) {
			int numOfWindows = ((WindowWall) wall).getAmountOfWindows();
			
			if (direction.equals("top") || direction.equals("bottom")) {
				//draw horizontal window line
				return g;
			}
			if (direction.equals("left") || direction.equals("right")) {
				//draw vertical window line
				return g;
			}
		}
		
		else if (wall.getType() == WallType.ROOM) {
			UUID attachedRoom = ((RoomWall)wall).getConnectedRoom();
			
			if (visitedRooms.contains(attachedRoom)) {
				if (direction.equals("top") || direction.equals("bottom")) {
					//draw horizontal room line
					return g;
				}
				if (direction.equals("left") || direction.equals("right")) {
					//draw vertical room line
					return g;
				}
			}
			
			else {
				for (Room r : house.getRooms()) {
					if (r.getId() == attachedRoom) {
						if (direction.equals("left")) {
							return DrawRoom(r, xCoord - 50, yCoord, g);
						}
						if (direction.equals("right")) {
							return DrawRoom(r, xCoord + 50, yCoord, g);
						}
						if (direction.equals("top")) {
							return DrawRoom(r, xCoord, yCoord + 50, g);
						}
						if (direction.equals("bottom")) {
							return DrawRoom(r, xCoord, yCoord - 50, g);
						}
					}
				}
			}
			
		}
		return g;
	}
}
