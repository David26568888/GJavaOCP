package day03;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] ans= {3,8,5,4};
			
			do {
				Scanner scanner = new Scanner(System.in);
				System.out.println("請輸入4位數字:");
				int guess = scanner.nextInt();
				int[] guessArray = {guess/1000,guess/100%10,guess%100/10,guess%10};
				System.out.println(Arrays.toString(guessArray));
				//計算A
				int aCount = 0;
				for(int i= 0;i<4;i++) {
					if(ans[i]==guessArray[i]) {
						aCount++;
						break;
					}
				}
				
				//計算B
				int bCount=0;
				outer:
				for (int i=0;i<4;i++) {
					inner:
					for(int k=0;k<4;k++) {
						if(ans[i]==guessArray[k]) {
							bCount++;
							break inner;
						}
					}
				}
				bCount= bCount-aCount;
				System.out.printf("%dA %dB",aCount,bCount);
				if(aCount==4) {
					System.out.println("答對! 遊戲結束");
					break;
				}
			}while(true);
				
			
			
	}

}
