package HomeWork09;

public class HomeWork09_01 implements Runnable {
//	開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//	• 參考範例：CounterRunnable.java
//	• 需留意主執行緒執行順序
	
//	第一版

	public int count;
	public Thread s;

	public void run() {
		while (count < 10) {
			count++;
			try {
				if (Thread.currentThread() == s) {
					System.out.println("饅頭人吃了" + count + "碗");
				} else {
					System.out.println("詹姆士吃了" + count + "碗");
				}
				Thread.sleep((int) (Math.random() * 2501) + 500);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		HomeWork09_01 steam = new HomeWork09_01();
		steam.s = new Thread(steam);

		HomeWork09_01 james = new HomeWork09_01();
		Thread j = new Thread(james);
		System.out.println("大胃王快食賽開始!");
		steam.s.start();
		j.start();

	}

}
