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
		if(flag==false){//��ʾ���п���ûǮ��
			flag=true;//����ִ�д�Ǯ�Ĵ���
			setFee(getFee()+money);
			System.out.println("��Ǯ�ɹ�������"+money+"�������:"+getFee());
			System.out.println("-----------------��");
			notify();//���Ѵ�Ǯ���߳�
		}else{
			
			try {
				System.out.println("---------------------��");
				wait();//��������Ǯ����ʱ��ִ�д�Ǯ�������߳�
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
				wait();//����false˵������û��Ǯ����wait()��ȡǮ�߳̽���ȴ�״̬
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			flag=false;
			setFee(getFee()-money);
			System.out.println("�̳߳ɹ�ȡ��Ǯ:"+money+"���"+getFee());
			System.out.println("--------------------------ȡ");
			notify();
		}
	}
}
}
