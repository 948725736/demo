package function;
/*�������أ�
 * ��ͬһ�����У��������һ�����ϵ�ͬ��������ֻҪ�����������߲������Ͳ�ͬ�Ϳ���
 * �ص㣺
 * �뷵��ֵ�޹أ�ֻ���������Ͳ����б�
 * �ڵ��õ�ʱ�������ͨ�������б�Ĳ�ͬ������ͬ������
 * Ϊ�˷���Java��Ҫ��(������Ҫ����֪��)
 * ���ԣ�����������ͬ�������б�ͬ ������£�Ϊ�˼���֪�⣬Java����������һ��������
 * */
public class Demo6 {
public static void main(String[] args) {
    byte b1=3;
    byte b2=4;
    System.out.println("byte:"+compare(b1,b2));
    short s1=5;
    short s2=5;
    System.out.println("short:"+compare(s1,s2));
    int i1=8;
    int i2=9;
    System.out.println("int:"+compare(i1,i2));
    long l1=33;
    long l2=89;
    System.out.println("long:"+compare(l1,l2));
}
//byte����
public static boolean compare(byte a,byte b){
	System.out.println("byte");
	return a==b;
}
//short
public static boolean compare(short a,short b){
	System.out.println("short");
	return a==b;
}
//int 
public static boolean compare(int a,int b){
	System.out.println("int");
	return a==b;
}
//long
public static boolean compare(long a,long b){
	System.out.println("Long");
	return a==b;
}

}
