package day07;

public class ClawMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClawMachine clawMachine= new ClawMachine();
		ClawMachine clawMachine = new DeluxeClawMachine();//宣告父類 新建子類(多型) //優點:可以使用調用子類的覆寫方法
		clawMachine.inserCoin();
		clawMachine.play();
		clawMachine.play();
		if(clawMachine instanceof DeluxeClawMachine) {
			((DeluxeClawMachine)clawMachine).playMusic();
			//透過強制轉型來呼叫playMusic()//但是會出錯// 必須在前面在加if instance判斷式避免出錯
		}
		
		System.out.println("-----------------------");
		
		DeluxeClawMachine deluxeClawMachine = new DeluxeClawMachine();
		deluxeClawMachine.inserCoin();
		deluxeClawMachine.play();
		deluxeClawMachine.play();
		deluxeClawMachine.playMusic();//與前者 多了一個DeluxeClawMachine的專屬方法可以呼叫
	}

}
