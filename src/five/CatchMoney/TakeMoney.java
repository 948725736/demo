package five.CatchMoney;

public class TakeMoney implements Runnable{
private Account a;
private double money;
public TakeMoney(){
	super();
}
public TakeMoney(Account a,double money){
	super();
	this.a=a;
	this.money=money;
}
@Override
public void run(){
	for(int i=0;i<3;i++){
		a.qu(money);
	}
}
}
