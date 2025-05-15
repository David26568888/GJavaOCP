package day06;


//工具(SingleTon單例模式 )
public class Util {
	
	private static Util util = new Util();
	
	private Util() {
		
	}
	public static Util getInstance() {
		return util;
	}
	public int add (int x,int y) {
		return x+y;
	}
	
	public int add(int x,int y,int z) {
		return x+y+z;
	}
	
//	public int add (int[] array) {
//		int total =0;
//		for (int row :array) {
//			total +=row;
//		}
//		return total;
//	}
	
	public int add(int... array) {
		int total = 0;
		for(int row:array) {
			total += row;
		}
		return total;
	}
}
