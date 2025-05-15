package day03;

public class StringAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'A';
		System.out.println(c1==c2);//true
		
		//建立字串 物件
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1==s2);//指的是儲存位置是否相同(==是用來比較stack內容)
		System.out.println(s1.equals(s2));//有分大小寫的比較(equals是用來比較實際內容值)
		System.out.println(s1.equalsIgnoreCase(s2));//無分大小寫的比較
		
		
		//建立字串2 String pool
		String s3= "Java";//字面值宣告(字串內容可以共用)
		String s4= "Java";//字面值宣告(字串內容可以共用)
		System.out.println(s3==s4);//true(記憶題位置共用)
		System.out.println(s3.equals(s4));//
		//總結:實務上不應該用" ==" 來比較字串內容而是用equals()來進行比較
	}

}
