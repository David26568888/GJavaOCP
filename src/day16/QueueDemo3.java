package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo3 {
	public static void main(String[] args) throws InterruptedException {
		Queue<String> patientQueue = new LinkedList<>();// 病人掛號佇列
		// 病人依序排隊看病
		patientQueue.offer("劉一 🧑‍🦱");
		patientQueue.offer("陳二 👩");
		patientQueue.offer("張三 🧓");
		patientQueue.offer("李四 👴");
		patientQueue.offer("王五 👵");
		patientQueue.offer("趙六 🧑");
		patientQueue.offer("孫七 🧑‍🎓");
		patientQueue.offer("周八 👨‍⚕️");
		patientQueue.offer("吳九 👩‍⚕️");
		patientQueue.offer("鄭十 🧕");

//📢👉✅🩺💬❌🏥🏃‍♂️➡️📋📋⏳🎉❤️

		System.out.println("🏥初始排隊名單:" + patientQueue);

		while (!patientQueue.isEmpty()) {
			String name = patientQueue.poll();
			System.out.println("📢叫號中....👉" + name);
			System.out.println("🏥排隊名單:" + patientQueue);

			Scanner scanner = new Scanner(System.in);
			System.out.println("👉" + name + "是否在場(y/n)=>");
			String arrived = scanner.nextLine();
			if (arrived.equals("y")) {
				System.out.println("✅" + name + "到場,看診中...");
				System.out.println("🏥最後排隊名單:" + patientQueue);
				Thread.sleep(3000);
			} else {
				System.out.println("X" + name + "過號，後退3格");
				int insertIdex=Math.min(3,patientQueue.size());//設計目前"後移3個"與現在隊伍長度哪一個小 返回
				((LinkedList<String>) patientQueue).add(insertIdex, name);
				System.out.println("🏥最後排隊名單:" + patientQueue);
			}
			scanner.close();
		}

	}
}
