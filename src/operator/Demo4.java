package operator;

/*
 * 单目运算符：~3
 * 双目运算符：3+4
 * 三目运算符
 * 格式：(比较表达式)？(表达式1):(表达式2);
 * 比较表达式：结果是图而过boolean类型
 * 执行流程：
 * 根据比较表达式的计算返回一个true或者false
 * 如果是true，就把表达式1作为结果
 * 如果是false，就把表达式2作为结果
 * */
public class Demo4 {
	//@Test
public void test(){
	int x=100;
	int y=200;
	//int z=((x>y)? x:y );输出Z为200
	//int z=((x<y)? x:y);输出Z为100
	int z=((x==y)? x:y);//输出z为200
	System.out.println("z:"+z);
}
//@Test
	public void test2(){
		//获取两个整数中的最大值
	int x=100;
	int y=200;
	int max=(x>y ? x:y);
	System.out.println("max:"+max);
	System.out.println("------------------");
	//获取三个整数中最大的值
	int a=10;
	int b=30;
	int c=20;
	//分两步：
	//A:先比较ab的最大值
	//B:拿ab的最大值再和c进行比较
	
	int temp=((a>b)? a:b);
	//System.out.println(temp);
	int max1=(temp>c ? temp:c);
	System.out.println("max1:"+max1);
	//一步搞定
	int max2=(a>b)?((a>c)?a:c):((b>c)?b:c);
	//int max2=a<b?a>c?a:c:b>c?b:c;
	System.out.println("max2:"+max2);
	System.out.println("--------------------");
	//比较两个数是否一样
	int m=100;
	int n=200;
	
	//boolean flag=(m==n)? true:false;
	//因为==本来就是boolean类型所以不需要这么写，直接输出就可以
	boolean flag= m==n;
	System.out.println(flag);
	}
}
