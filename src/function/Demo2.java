package function;

import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("�������һ������");
	 int a=sc.nextInt();
	 System.out.println("������ڶ�������");
	 int b=sc.nextInt();
	 System.out.println("���������������");
	 int c=sc.nextInt();
	 int result =getMax(a,b);
	 System.out.println("����֮��ϴ�ֵ�ǣ�"+result);
	 System.out.println("-------------------------");
	 boolean fl=compare (a,b);
	 System.out.println(fl);
	 System.out.println("--------------------------");
	 int max=getMax1(a,b,c);
	 System.out.println("max:"+max);
	 
}
/*
 * �����������еĽϴ�ֵ
 * ������ȷ����
 * ����ֵ���ͣ�int
 * �����б�int a;int b
 * */
private static int getMax(int a, int b) {
	/*if���
if(a<b){
	//System.out.println(a);
	return a;
}else{
	//System.out.println(b);
	return b;
}*/
	//����Ԫ����Ľ�
	//int c=((a>b)?a:b);
	//return c;
	//����c���Ǻ����ʽ��
	return((a>b)?a:b);
}
/*
 * ���󣺱Ƚ��������Ƿ����
 * ������ȷ��
 * ����ֵ���ͣ�boolean
 * �����б�int a,int b
 * 
 * */
public static boolean compare(int a,int b){
	/*if���ĸ�ʽ2ʵ��
	if(a==b){
		return true;
	}else{
		return false;
	}*/
	//��Ԫ�Ľ�
	  boolean fla =((a==b)?true:false);
	return fla;
	//�����Ľ�
	//return((a==b)?true:false);
	//���հ�
	//return a==b   ;
}
/*����
 *  �����������е������
 *  ������ȷ��
 *  ����ֵ���ͣ�int
 *  �����б� int a, int b, int c
 * */
public static int getMax1(int a,int b,int c){
	/*ifǶ�����
	if(a>b){
		if(a>c){
			return a;
		}else{
			return c;
		}
	}else{
		if(b>c){
			return b;
				}else{
				return c;
				}
				}
	}
	*/
	/*��Ԫ�Ľ�
	if(a>b){
		return (a>c ? a:c);
	}else{
		return (b>c? b:c);
	}
	*/
	//�����Ľ�
	//return(a>b)?(a>c?a:c):(b>c? b:c);
	int temp=((a>b)?a:b);
	int max=((temp>c)?temp:c);
	return max;
}
}
