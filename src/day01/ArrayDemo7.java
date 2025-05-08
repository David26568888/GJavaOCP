package day01;

import java.security.cert.X509Certificate;
import java.util.stream.IntStream;

import org.w3c.dom.ls.LSOutput;

public class ArrayDemo7 {

	public static void main(String[] args) {
	int[] scoresA = {100,80,60};
	int[] scoresB = {40,45,50};
	//求平均
	int sumA = 0;
	for (int x: scoresA) {
		sumA=sumA+x;
	}
	int avgA=sumA/scoresA.length;
	//=------------------------------
	
	int sumB =0;
	for(int x:scoresB) {
		sumB= sumB+x;
	}
	int avgB= sumB/scoresB.length;
	//===================================
	System.out.println("scoresA的平均:"+avgA);
	System.out.println("scoresB的平均:"+avgB);
	//計算deltaA與deltaB------------
	
	double deltaA=0;
	for(int x:scoresA) {
		deltaA = deltaA+Math.pow(x-avgA,2);
	}
	double sdA= Math.sqrt(deltaA/scoresA.length);//標準差	
	//---------------------------------
	double deltaB = 0;
	for (int x:scoresB) {
		deltaB= deltaB+Math.pow(x - avgB,2);
}	
	double sdB = Math.sqrt(deltaB/scoresB.length);
	//--------------------------------------
	System.out.println("scoresA的標準差:"+sdA);
	System.out.println("scoresB的標準差:"+sdB);
	//---------------
	//判斷集中度
	if (sdA<sdB) {
	System.out.println("scoresA集中度比較高");
	}else {
		System.out.println("scoresB集中度比較高");
	}
		}

}

	
	


	


