package function;

import java.util.Scanner;

//����¼�������������������Ӧ������
public class Demo1 {
public static void main(String[] args) {
	/*�������
	 * ������ȷ
	 * ����ֵ���� ��void
	 * �����б�int m,int n
	 *  */
	Scanner sc=new Scanner(System.in);
System.out.println("����������");
int m=sc.nextInt();
System.out.println("����������");
int n=sc.nextInt();
xingxing(m,n);
}
public static void xingxing(int m,int n){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			System.out.print("*");
		}
		System.out.println();
	}

}
}
