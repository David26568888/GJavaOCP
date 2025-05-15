package day05;

public class BedAndBreakfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport airport = new Transport("機場接送", 500);
		Transport trainsation = new Transport("高鐵接送", 200);
		Transport self = new Transport("自行前往", 20);
		Breakfast breakfastA = new Breakfast(150);
		Breakfast breakfastB = new Breakfast(350);
		
		//建立房間
		Room room1 = new Room("南洋風", 4, 4500, breakfastB, airport);
		Room room2 = new Room("工業風", 2, 2000, breakfastA, self);
		
		int total = 0;
		Object[] rooms = {room1,room2};
		for(Object room : rooms) {
			System.out.println(room);
			if (room instanceof Room) {
				total += ((Room)room).getPrice();
			}
		}
		System.out.println("---------------------");
		System.out.printf("總價:%,d%n",total);
	}
	
	

}
