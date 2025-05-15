package day16;

import java.util.LinkedList;
import java.util.Queue;

/*		→1.ArrayList 

List→	→2.Stack"堆疊 先進後出 FILO"

		→3.LinkedList "佇列 FIFO"→Queue	→poll"拿到會剔除"
										→peek"拿到不會踢出"
										*/

public class QueueDemo1 {
	public static void main(String[] args) {
		//"佇列Queue (FIFO:先進先出)
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(500);
		queue.offer(1000);
		queue.offer(200);
		queue.offer(100);
		System.out.println(queue);
		//拿出第一筆使用peek 會發現數列並未變形
		System.out.println("Peek:"+queue.peek());
		System.out.println(queue+"size"+queue.size());
		
		//拿出第一筆 使用poll 會發現數列第一筆已消失
		System.out.println("Poll:"+queue.poll());
		System.out.println(queue+"size"+queue.size());
	}
}
