 package 一维数组;
/*数组静态初始化
 * 格式：数据类型 [] 数组名=new 数据类型[]{元素1，元素2，元素3.........};
 * 简化格式：int []arr={1,2,3....}
 * 注意事项：
 * 不要同时动态和静态进行
 * 如下：int []arr=new [3]{1,2,3};//错误
 * */
public class Demo2 {
public static void main(String[] args) {
	int []arr=new int[]{1,2,3};
	System.out.println(arr);
	System.out.println(arr[0]);
}
}
