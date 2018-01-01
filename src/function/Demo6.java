package function;
/*方法重载：
 * 在同一个类中，允许存在一个以上的同名方法，只要参数个数或者参数类型不同就可以
 * 特点：
 * 与返回值无关，只看方法名和参数列表
 * 在调用的时候，虚拟机通过参数列表的不同来区分同名方法
 * 为了符合Java的要求(方法名要见名知意)
 * 所以，方法功能相同，参数列表不同 的情况下，为了见名知意，Java允许他们起一样的名字
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
//byte类型
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
