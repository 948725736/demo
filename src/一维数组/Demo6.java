package 一维数组;
/*数组元素逆序
 * 分析：
 * 定义一个数组，病进行静态初始化
 * 思路：			把0下标和arr.length-1的数据交换
 * 						把1下标和aee.length-2的数据交换
 * 						依次类推
 * */
public class Demo6 {
	public static void main(String[] args) {
		int arr[]={211,332,34,23,1232};
		//逆序前
		System.out.println("逆序前：");
		printArray1(arr);
		//逆序后
		System.out.println("逆序后：");
		//reverse(arr);
		reverse2(arr);
		printArray1(arr);
		/*
		 * 需求：数组逆序
		 * 两个明确： 返回值类型：void
		 * 参数列表:int arr[]
		 * */
		
	}

	public static void reverse(int []arr){
//		第一次交换
//		int temp=arr[0];
//		arr[0]=arr[arr.length-1];
//		arr[arr.length-1]=temp;
//		第二次交换
//		int temp=arr[1];
//		arr[1]=arr[arr.length-1-1];
//		arr[arr.length-1-1]=temp;
		//用循环改进
		for(int x=0;x<arr.length/2;x++){
			int temp=arr[x];
			arr[x]=arr[arr.length-1-x];
			arr[arr.length-1-x]=temp;
		}
	}
	public static void reverse2(int []arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
//	public static void printArray(int arr[]){
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//	}
	//遍历数组
	public static void printArray1(int arr[]){
		System.out.println("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){//这是最后一个元素
				System.out.println(arr[x]+"1");
			}else{
				System.out.println(arr[x]+",");
			}
		}
	}
}
