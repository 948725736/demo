package 二维数组;

public class Demo1 {
public static void main(String[] args) {
	int [] [] arr=new int[3][];
	System.out.println(arr);//地址值
	System.out.println(arr[0]); //null
	System.out.println(arr[1]); //null
	System.out.println(arr[2]); //null
	//因为每个一维数组都没有为他动态分配
	//动态的为每一个以为数组分配空间
	arr[0]=new int[2];
	arr[1]=new int[3];
	arr[2]=new int[1];
	
	System.out.println(arr[0]); //地址值
	System.out.println(arr[1]); //地址值
	System.out.println(arr[2]); //地址值
}
}
