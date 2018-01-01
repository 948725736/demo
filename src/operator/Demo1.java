package operator;
/*
 * 基本赋值运算符：=
 * 扩展赋值运算符：+=，-=，*=,/=，%=
 * **/
public class Demo1 {
public static void main(String[] args) {
	//定义一个变量
	int x=10;
	//其他用法
	int a,b;
	a=b=10;
	System.out.println(a);
	System.out.println(b);
	System.out.println("-------------------------");
	//定义一个变量
	int y=10;
	y += 20;//+=表示把左边的y值加上右边的值，就是10+20 的意思
	System.out.println(y);
}
}
