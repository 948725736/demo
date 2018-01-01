package 一维数组;
//ArrayIndexOutOfBoundsException数组索引越界异常，你访问了不存在的下标
//NullPointerException空指针异常，数组已经不再指向内存了
//一共三个数，只能访问最多下标为2的数组元素
public class Demo3 {
public static void main(String[] args) {
	// 定义数组
	int[]arr={1,2,3};
	//System.out.println(arr[3]);ArrayIndexOutOfBoundsException
	arr=null;//引用类型的常量：空常量：null
	//System.out.println(arr[0]);//NullPointerException
}
}
