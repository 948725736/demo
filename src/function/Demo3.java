package function;
/*void的调用类型
 * 单独调用
 * 赋值调用（报错，不可以使用）
 * 输出调用（报错，不能使用）
 * */
public class Demo3 {
public static void main(String[] args) {
	//需求：输出一个6行7列的星形图形
	for(int i=0;i<6;i++){
		for(int j=0;j<7;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("---------------------------");
	//单独调用
	pringxing(3,4);
	System.out.println("----------------------------");
	pringxing(6,7);//调用pringxing里的方法
	System.out.println("--------------------------");
	//输出调用
	//此处不允许使用“空”类型
	//System.out.println(pringxing(3,4));  错误方式
	//赋值调用
	//非法的表达式
	//void v=pringxing(3,4);
}
/*写一个m行n列的代码
 * 两个明确：
 * 返回值类型：这个歌会后没有明确的返回值，不写东西也不行，所以是void
 * 参数列表： int m,int n
 * */
public static void pringxing(int m,int n){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			System.out.print("*");
		}
		System.out.println();
	}
System.out.println("--------------------------------");
} 

}
