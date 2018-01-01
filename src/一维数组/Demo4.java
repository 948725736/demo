package 一维数组;
/*数组遍历：就是一次输出数组中的每一个元素
 * */
public class Demo4 {
	public static void main(String[] args) {
//定义数组
	int []arr={11,22,33,44,55};
	//获取每一个元素
	//第一种方法：根据数组数组名加上索引找到数据
	System.out.println(arr[0]);
	//第二种方法:用循环遍历
	for(int i=0;i<5;i++){
		//可以输出下标小于5的元素
		System.out.println(arr[i]);
	}
		System.out.println("---------------------------");
		//从0开始我们是明确的，i<5是因为数了数组元素有5个
		//当数组元素很多时的遍历如下
		int[]arr1={1,2,3,4,5,6,7,8,9,10,11,16,17,18,19,20,5,3,51,2,45,56,67,5,6};
		//数组在这个时候给我们提供了一种属性：length用于获取数组长度
		//格式：数组名.length返回数组的长度
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println("-------------------------");
		for(int x=0;x<arr.length;x++){
			System.out.println(arr1[x]);
		}
		
		System.out.println("----------------------------");
		printArray(arr);
		System.out.println("-----------------");
		printArray(arr1);
		System.out.println("-----------------");
		printArray2(arr);
		System.out.println("-----------------");
	}
		//我们如果想要对多个数组进行遍历，每个数组的遍历都要把代码写一遍太麻烦
		//所以准备改进
//		两个明确   返回类型：void    参数列表：int [] arr  
		public static void printArray(int [] arr){
			for(int x=0;x<arr.length;x++){
				System.out.println(arr[x]);
			}	
		}
		public static void printArray2(int [] arr){
			System.out.print("[");
			for(int x=0; x<arr.length; x++) {
				if(x == arr.length-1) { //如果是数组最后一个元素
					System.out.println(arr[x]+"]");
				}else {
					System.out.print(arr[x]+", ");
				}
			}	
	}
}