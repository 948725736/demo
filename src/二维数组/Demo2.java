package 二维数组;
//静态定义方式
public class Demo2 {
public static void main(String[] args) {
	int [] [] arr={{1,2,3},{4,5},{6}};
	System.out.println(arr);//[[I@1db9742
	System.out.println(arr[0]); //[I@106d69c
	System.out.println(arr[1]); //[I@52e922
	System.out.println(arr[2]); //[I@25154f
	
	System.out.println(arr[0][0]); //1
	System.out.println(arr[1][0]); //4
	System.out.println(arr[2][0]); //6
	
	System.out.println(arr[0][1]); //2
	System.out.println(arr[1][1]); //5
	//System.out.println(arr[2][1]); //6后面没有数了所以越界
}
}
