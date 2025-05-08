package day04;

public class ForeachDemo2 {
	public static void main(String[] args) {
		int[][] scores = {{100,90},{80,70},{60,50}};
		//利用for each 印出每一個成績
		for(int[] row :scores) {//分析一為陣列出來
			for(int score : row) {//再從一維陣列分析分數
				System.out.println(score);
			}
		}
		
		System.out.println("============");
		int[][][] scores2 = {
				{{100,90},{80,70}},
				{{60,50},{40,30}},
				{{20,10},{5,1}}
				};
		for(int[][] row2 : scores2) {
			for(int[] row : row2) {
				for(int score : row) {
					System.out.println(score);
				}
			}
		}
	}
}
