package function;

import java.util.Scanner;

//键盘录入行数和列数，输出对应的星形
public class Demo1 {
public static void main(String[] args) {
	/*输出星形
	 * 两个明确
	 * 返回值类型 ：void
	 * 参数列表：int m,int n
	 *  */
	Scanner sc=new Scanner(System.in);
System.out.println("请输入行数");
int m=sc.nextInt();
System.out.println("请输入列数");
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
