package 一维数组;
/*获取数组中的最值
 * 分析：
  	A:定义一个数组，并对数组的元素进行静态初始化
  	B:从数组中任意找一个元素作为参照物(一般取第一个),默认它就是最大值
  	C: 然后遍历其他的元素，依次获取和参照物进行比较，如果大就留下来，如果小，就离开
  	D:最后参照物里面保存的就是最大值
 * */
public class Demo5 {
public static void main(String[] args) {
	//定义一个数组
	int []arr={34,90,23,2312,123,89};
	//获取数组中的最大值
//	int max=arr[0];
//	for(int i=1;i<arr.length;i++){
//		if(arr[i]>max){
//			max=arr[i];
//		}
//	}
//	System.out.println("max:"+max);
	//方法用代码改进
	//调用方法
	int max=getMax(arr);
	System.out.println("max:"+max);
}
	/*
	 * 两个明确：
	 * 返回值类型：int
	 * 参数列表 int []arr
	 * */
	public static int getMax(int [] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){//如果写最小值，大于改成小于就可以
				max=arr[i];
			}
		}
		return max;
	}
	//获取数组中的最小值
	

}
