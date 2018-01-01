package operator;
/*
 * 逻辑运算符
 * ^，|，^,!
 * ^^,||
 * 特点： 逻辑运算符一般用于连接boolean类型的表达式或者值
 * 
 * 表达式：就是用运算符把常量或者变量连接起来的复合Java语法的式子
 * 
 * &&和&的区别，||和|的区别
 * 		A:最终的结果一样
 * 		B:&&具有短路效果，左边是false时，右边不执行
 * 
 * */
public class Demo2 {
public static void main(String[] args) {
	int a=3;
	int b=4;
	int c=5;
	// &并且的时候有一个为false则都为false
	System.out.println((a>b)&(a>c));//false & false = false
	System.out.println((a>b)&(a<c));//false & true = false
	System.out.println((a<b)&(a>c));//true & false = false
	System.out.println((a<b)&(a<c));//true & true = true
	System.out.println("-------------------------------------");
	// |或者的时候有一个为true则所有的都为true
	System.out.println((a>b)|(a>c));//false | false = false
	System.out.println((a>b)|(a<c));//false | true = true
	System.out.println((a<b)|(a>c));//true | false = true
	System.out.println((a<b)|(a<c));//true |true = true
	System.out.println("-----------------------");
	// ^逻辑异或的时候，两个相同的布尔返回false；两个返回不一样就是true
	System.out.println((a>b)^(a>c));//false ^ false = false
	System.out.println((a>b)^(a<c));//false ^ true =  true
	System.out.println((a<b)^(a>c));//true ^ false =  true
	System.out.println((a<b)^(a<c));//true ^ true = false
	System.out.println("-------------------------------");
	// !逻辑非非false则true，偶数个！不改变本身，奇数改变
	System.out.println(!(a>b));//!false=true
	System.out.println(!(a<b));//!true=false
	System.out.println(!!(a>b));//!!false=false
	System.out.println(!!!(a<b));//!!!false=true
	System.out.println("----------------------------------");
	System.out.println((a>b)&&(a>c));//false && false = false
	System.out.println((a>b)&&(a<c));//false && true = false
	System.out.println((a<b)&&(a>c));//true && false = false
	System.out.println((a<b)&&(a<c));//true && true = true
	System.out.println("----------------------------");
	int x=3;
	int y=4;
	//boolean b1=(x++ == 3 & y++ == 4);//x:4,y:5  true
	//boolean b1=(x++ == 3 && y++ == 4);//x:4,y:5  true
	boolean b1=(++x == 3 && y++ == 4);//x:4,y:4  false
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	System.out.println(b1);
}
}
