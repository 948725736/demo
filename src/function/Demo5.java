package function;

import java.util.Scanner;

public class Demo5 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("������n��ֵ(1~9)");
	int n=sc.nextInt();
	printnn(n);
}
/*���������Ӧ��nn�˷���
 * ������ȷ�� ����ֵ���ͣ�void
 * �����б�int n
 * */
public static void printnn(int n){
	for(int x=1;x<=n;x++){//��Ϊ�˷���û��0�����Դ�1��ʼ
		for(int y=1;y<=x;y++){
			System.out.print(y+"*"+x+"="+y*x+"\t");//y*x=yx
		}
		System.out.println();
	}
}
}
