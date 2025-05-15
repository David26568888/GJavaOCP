package day11;

public class IKEAMain {
	public static void main(String[] args) {
		//一班內部類調用
		IKEAWardrobe ikeaWardrobe = new IKEAWardrobe("PAX 標準衣櫃");
		//從外部類調用內部類
		IKEAWardrobe.AssemblyGuide assemblyGuide = ikeaWardrobe.new AssemblyGuide();
		assemblyGuide.printSteps();
		
		//靜態內部類別
		IKEAWardrobe.Catalog catalog = new IKEAWardrobe.Catalog("2025 家具目錄");
		catalog.display();
	
		//檢查
		ikeaWardrobe.checkComponent();
		
		//顧客回函(匿名內部類)
		//因為是Interface 不能直接新建物件 透過匿名內部類 新建物件
		IKEAWardrobe.FeedbackFrom feedbackFrom = new IKEAWardrobe.FeedbackFrom() {
			
			@Override
			public void submit(String message) {
				System.out.printf("回函內容: %s%n",message);
			}
		};
		feedbackFrom.submit("不錯用~ CP值高!");
		
	}

}
