package five.CatchMoney;

public class Test {
public static void main(String[] args) {
	Account a=new Account(0.00,false);
	SaveMoney sm=new SaveMoney(a,800.00);
	TakeMoney tm=new TakeMoney(a,800.00);
	Thread t1=new Thread(sm);
	Thread t2=new Thread(tm);
	t1.start();
	t2.start();
}
}
