package HomeWork09;

public class HomeW_0901 {
//	開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//	• 參考範例：CounterRunnable.java
//	• 需留意主執行緒執行順序
//	第2版

	public static void main(String[] args) {
		Player[] player = new Player[] { new Player(), new Player("詹姆士") };

		for (int i = 0; i < player.length; i++) {
			player[i].start();
		}
		Player.ready = true;
		System.out.println("====大胃王快食賽開始!====");
		try {
			
			player[0].join();
			player[1].join();
			System.out.println("====大胃王快食賽結束====");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

class Player extends Thread {
	public static boolean ready = false;
	public int count;

	public Player() {
		super("饅頭人");
	}

	public Player(String name) {
		super(name);
	}

	public void run() {
		while (!ready) {
		}
		try {
			while (count < 10) {
				count++;
				System.out.println(getName() + "吃了" + count + "碗飯");
				Thread.sleep((int) (Math.random() * 2501) + 500);
			}
			System.out.println(getName() + "吃完了");
		} catch (Exception e) {
			e.getStackTrace();
		}
	
	}

}