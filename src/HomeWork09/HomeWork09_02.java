package HomeWork09;

public class HomeWork09_02 {
//	熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//	錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//	3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//	以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//	大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//	已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//	1000元,寫一個Java程式模擬匯款10次與提款10次的情
//	形。

//	第一版(死
	public static void main(String[] args) {
		Account account = new Account();
		Depositer depositer = new Depositer("媽媽", account);
		Pickuper pickuper = new Pickuper("熊大", account);
		depositer.start();
		pickuper.start();
	}
}

class Account {
	int balance = 0;

	synchronized public void deposit(int money) {
		while (balance >= 3000) {
			System.out.println("媽媽看到戶頭超過3000元，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存入" + money + " 目前戶頭共有:" + balance);
		notify();
	}

	synchronized public void pickup(int money) {
		if (balance > 2000) {
			balance -= money;
			System.out.println("熊大領走" + money + " 目前戶頭共有:" + balance);
			notify();
		} else if (balance <= 2000 && balance >= money ) {
			System.out.println("熊大看到快沒錢了，要求媽媽匯款");
			balance -= money;
			System.out.println("熊大領走" + money + " 目前戶頭共有:" + balance);
			notify();
		} else {
			System.out.println("熊大看到戶頭沒有錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Depositer extends Thread {
	Account account;

	Depositer() {
		super("媽媽");
	}

	Depositer(String name, Account account) {
		super(name);
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.deposit(2000);
		}
	}
}

class Pickuper extends Thread {
	Account account;

	Pickuper() {
		super("熊大");
	}

	Pickuper(String name, Account account) {
		super(name);
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.pickup(1000);
		}
	}
}
