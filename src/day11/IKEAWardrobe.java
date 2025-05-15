package day11;


//衣櫥
public class IKEAWardrobe {
	private String model;
	
	
	public IKEAWardrobe(String model) {
		this.model = model;
	}
	
	//內部類別(衣櫃組裝說明書)
	public class AssemblyGuide{ 
		private String[] steps = {
				"將底板放在地面上",
				"安裝兩側版並固定背板",
				"安裝頂板與層板",
				"裝上衣櫃門與把手",
				"調整門絞鍊使門對齊"
				};
		public void printSteps() {
			//System.out.printf("%s 衣櫃組裝步驟%n",IKEAWardrobe.this.model); 調用外部類
			System.out.printf("%s 衣櫃組裝步驟%n",model);//同上 只是省去部分代碼 但兩者相同
			for(int i=0;i<steps.length;i++) {
				System.out.printf("步驟 %d: %s%n", (i+1), steps[i]);
			}	
		}
	}
	
	//靜態類別 (型錄) 
	public static class Catalog{
		private String catalogName;
		public Catalog(String catalogName) {
			this.catalogName = catalogName;
		}
		
		private String[] items ={
				"PAX001 PAX衣櫃 $3500",
				"KOM002 KOM抽屜 $1200",
				"KOM003 KOM掛衣桿 $599"
		};
		//可加預設建構子
		
		public void display() {
			System.out.println("2025 家具目錄:");
			for(int i=0;i<items.length;i++) {
				System.out.printf("項目 %d: %s%n", (i+1), items[i]);
			}
		}
	}
	
	//檢查行為
	public void checkComponent() {
		final String action  = "檢查是否組件完整"; //final JAVA7以前 必須再語法上限制 必須+再此行+final可以打成下行
		//String action  = "檢查是否組件完整";//區域變數
		
		//action="ABC";   <<<測試 讓action 變成非final 區域變數
		
		//方法內部類別(檢查是否組件完整)
		//沒有權限
		class Checker {
			private String[] items = {"抽屜", "掛衣桿", "層板"};
			public void check() {
				System.out.println(action + ":");//只能取得checkComponent()方法提供的final 區域變數
				for(int i=0;i<items.length;i++) {
					System.out.printf("檢查項目 %d: %s%n", (i+1), items[i]);
				}
			}
		}
		//建立 Checker 物件
		Checker checker = new Checker();
		checker.check();
	}
	
	//顧客回函(介面)
	interface FeedbackFrom{
		void submit(String message);
	}
}
