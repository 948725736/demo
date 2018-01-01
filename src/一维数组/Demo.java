package 一维数组;
/*动态初始化：
   数据类型[]数组名 = new 数据类型[数组长度];
     int []arr=new int[3];
  	
  	如何获取数组中的元素：
  	通过：数组名[索引]
  	索引就是每个元素的编号，并且是从0开始，最大编号是数组的长度减1，就是下标
 */
public class Demo {
	public static void main(String[] args) {
		int []arr=new int [3];
		/*左边：
		 * int:说明数组类型是int 类型
		 * []：说明这是一个数组
		 * arr：是数组名字
		 * 右边：
		 * new：为数组分配空间
		 * int：说明数组中的元素的数据类型是int类型
		 * []:说明这是一个数组
		 * 3：数组长度，也就是数组中元素的个数
		 * 
		 * */
		System.out.println(arr);//[I@1db9742输出的是地址值
		//其实数组中的每个元素是有编号的，并且是从0开始，最大编号是数组的长度减1
		//用数组名和编号的配合就可以获取数组中的制定编号的元素，叫做索引
		//通过数组名访问数据的格式是：数组名[索引];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-------------------");
		//给数组赋值
		arr[0]=100;
		arr[2]=90;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
