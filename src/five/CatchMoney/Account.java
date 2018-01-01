package five.CatchMoney;

public class Account {
private double fee;
private boolean flag;
protected Account (double fee,boolean flag){
	super();
	this.fee=fee;
	this.flag=flag;
}
protected Account (){
	super();
}
public void setFee(double fee){
	this.fee=fee;
}
public double getFee(){
	return fee;
}
public synchronized void cun(double money){
	for(int i=0;i<3;i++){
		if(flag==false){//表示银行卡里没钱，
			flag=true;//可以执行存钱的代码
			setFee(getFee()+money);
			System.out.println("存钱成功，存了"+money+"现在余额:"+getFee());
			System.out.println("-----------------存");
			notify();//唤醒存钱的线程
		}else{
			
			try {
				System.out.println("---------------------存");
				wait();//代表卡里有钱，暂时不执行存钱的那条线程
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public synchronized void qu(double money){
	for(int i=0;i<3;i++){
		if(flag==false){
			try {
				wait();//等于false说明里面没有钱就用wait()让取钱线程进入等待状态
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			flag=false;
			setFee(getFee()-money);
			System.out.println("线程成功取走钱:"+money+"余额"+getFee());
			System.out.println("--------------------------取");
			notify();
		}
	}
}
}
