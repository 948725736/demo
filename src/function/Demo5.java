package function;

import java.util.Scanner;

public class Demo5 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入n的值(1~9)");
	int n=sc.nextInt();
	printnn(n);
}
/*需求：输出对应的nn乘法表
 * 两个明确： 返回值类型：void
 * 参数列表：int n
 * */
public static void printnn(int n){
	for(int x=1;x<=n;x++){//因为乘法中没有0，所以从1开始
		for(int y=1;y<=x;y++){
			System.out.print(y+"*"+x+"="+y*x+"\t");//y*x=yx
		}
		System.out.println();
	}
}
}
