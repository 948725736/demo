package five.CatchMoney;

public class SaveMoney implements Runnable{
private Account a;
private double money;
public SaveMoney(){
	super();
}
public SaveMoney(Account a,double money){
	super();
	this.a=a;
	this.money=money;
}
@Override
public void run(){
	for(int i=0;i<3;i++){
		a.cun(money);
	}
}
}
