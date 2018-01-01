package function;

import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("请输入第一个数据");
	 int a=sc.nextInt();
	 System.out.println("请输入第二个数据");
	 int b=sc.nextInt();
	 System.out.println("请输入第三个数据");
	 int c=sc.nextInt();
	 int result =getMax(a,b);
	 System.out.println("两者之间较大值是："+result);
	 System.out.println("-------------------------");
	 boolean fl=compare (a,b);
	 System.out.println(fl);
	 System.out.println("--------------------------");
	 int max=getMax1(a,b,c);
	 System.out.println("max:"+max);
	 
}
/*
 * 需求：两个数中的较大值
 * 两个明确：；
 * 返回值类型：int
 * 参数列表：int a;int b
 * */
private static int getMax(int a, int b) {
	/*if语句
if(a<b){
	//System.out.println(a);
	return a;
}else{
	//System.out.println(b);
	return b;
}*/
	//用三元运算改进
	//int c=((a>b)?a:b);
	//return c;
	//由于c就是后面的式子
	return((a>b)?a:b);
}
/*
 * 需求：比较两个数是否相等
 * 两个明确：
 * 返回值类型：boolean
 * 参数列表：int a,int b
 * 
 * */
public static boolean compare(int a,int b){
	/*if语句的格式2实现
	if(a==b){
		return true;
	}else{
		return false;
	}*/
	//三元改进
	  boolean fla =((a==b)?true:false);
	return fla;
	//继续改进
	//return((a==b)?true:false);
	//最终版
	//return a==b   ;
}
/*需求
 *  返回三个数中的最大数
 *  两个明确：
 *  返回值类型：int
 *  参数列表： int a, int b, int c
 * */
public static int getMax1(int a,int b,int c){
	/*if嵌套语句
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
	/*三元改进
	if(a>b){
		return (a>c ? a:c);
	}else{
		return (b>c? b:c);
	}
	*/
	//继续改进
	//return(a>b)?(a>c?a:c):(b>c? b:c);
	int temp=((a>b)?a:b);
	int max=((temp>c)?temp:c);
	return max;
}
}
