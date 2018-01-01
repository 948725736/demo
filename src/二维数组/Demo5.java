package 二维数组;

import java.util.Scanner;

/*需求：
 * 1
 * 1  1  
 * 1  2  1
 * 1  3  3  1
 * 1  4  6  4  1
 *分析： 看这种图像的规律
 * A:任何一行的第一列和最后一列都是1
 * B:从第三行开始，每一个数据都是他上一行的前一列和上一行的本列之和
 * 步骤：A:首先定义一个二维数组,如果行数定义为n，我们把列数也先定为n
 * 				这个n的数据来自键盘录入
 * 			  B:给这个二维数组任何一行的第一列和最后一列赋值为1
 * 			  C：按照规律给其他的元素赋值
 * 			  D：遍历这个二维数组
 * 
 * */
public class Demo5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入第一个数据：");
	int n=sc.nextInt();
	//定义二维数组
	int [] [] arr=new int[n] [n];
	//给这个二维数组任何一行的第一列和最后一列赋值为1
	for(int x=0;x<arr.length;x++){
		arr[x] [0]=1;
		arr[x] [x] =1;
	}
	for(int x=2;x<arr.length;x++){
		//如果y<=x这里是有问题的，就是最后一列的问题，所以这里要减去1
		//并且y也应该从1开始，因为是第一列也有值了
		for(int y=1;y<=x-1;y++){
			//每一个数据是它上一行的前一列和它上一行的本列之和
			arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
		}
	}
	//这个时候内循环的变化要和九九乘法表类似
//	for(int x=0;x<arr.length;x++){
//		for(int y=0;y<arr[x].length;y++){
//			System.out.print(arr[x][y]+"\t");
//		}
//		System.out.println();
//	}
	for(int x=0;x<arr.length;x++){
		for(int y=0;y<=x;y++){
			System.out.print(arr[x][y]+"\t");
		}
		System.out.println();
	}
}
}
