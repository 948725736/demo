package ��ά����;

public class Demo1 {
public static void main(String[] args) {
	int [] [] arr=new int[3][];
	System.out.println(arr);//��ֵַ
	System.out.println(arr[0]); //null
	System.out.println(arr[1]); //null
	System.out.println(arr[2]); //null
	//��Ϊÿ��һά���鶼û��Ϊ����̬����
	//��̬��Ϊÿһ����Ϊ�������ռ�
	arr[0]=new int[2];
	arr[1]=new int[3];
	arr[2]=new int[1];
	
	System.out.println(arr[0]); //��ֵַ
	System.out.println(arr[1]); //��ֵַ
	System.out.println(arr[2]); //��ֵַ
}
}
