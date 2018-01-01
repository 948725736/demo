package function;
/*方法就是完成特定功能的代码块
 * 注意：
 * 在很多语言里面有函数的定义，而在Java中函数被称为方法
 * 方法格式：
 * 修饰符 返回值类型  方法名(参数类型  参数名1，参数类型 参数名2.....){
 * 		方法体语句；
 *		 return 返回值；
 * 		}
 * 详细解释：
 * 修饰符：目前就用public static ,后面讲解其他的修饰符
 * 返回值类型：就是功能结果的数据类型
 * 方法名：复合命名规则就可以，方便我们的调用
 * 参数：
 * 实际参数：就是实际参与运算的
 * 形式参数:就是方法上定义的，用于接受实际参数的
 * 参数类型：就是参数的数据类型
 * 参数名：就是变量名
 * 方法体语句：就是完成功能的代码
 * retrun：结束方法的
 * 返回值：就是功能的结果， 由return带给调用者
 * 要想写好一个方法，就必须明确两个东西：
 * A:返回值类型：结果的数据类型
 * B：参数列表：你要传递几个参数，以及每个参数的数据类型
 * 方法的执行特点：不调用，不执行
 * 
 * */
public class Demo {
public static void main(String[] args) {	
	int x=10;
	int y=20;
	//方式1：当有明确返回值的时候，单独调用没有意义，所以不推荐
	//sum(x,y);
	//方式2：输出调用
	//说明直接把x的值赋给a，y的值赋给b
	//不够好，因为可能针对结果进行进一步的操作，而这个接收之后直接打印了
	System.out.println(sum(x,y));
	//方式3 赋值调用
	int result=sum(x,y);
	//result还可以继续操作
	System.out.println(result);
}
/*
 * 需求：求连个数据之间的和
 * 两个明确
 * 返回值类型：int
 * 参数列表：2个，都是int类型
 * */
public static int sum(int a,int b){
	//int c=a+b;
	//return c;
	return a+b;
}
}
