package day03;

public class MultiArrayDemo2 {
public static void main(String[] args) {
	char[][] ttt = {{'O','X','X'},{'x','O',' '},{'O',' ',' '}};
	//請問'O' 要放在哪裡就會贏
	//並印出棋盤
	System.out.println(ttt[0]);
	System.out.println(ttt[1]);
	System.out.println(ttt[2]);

	
	System.out.println("-------------");
	ttt[2][2]='O';
	System.out.println(ttt[0]);
	System.out.println(ttt[1]);
	System.out.println(ttt[2]);
	
	System.out.println("-------------");
	int x;
	int y;
	for (x=0;x<ttt.length;x++) {
		for(y=0;y<ttt[x].length;y++) {
			System.out.printf("%c",ttt[x][y]);
		}
		System.out.println();
	}
	
}
}
