package 二维数组;
//二维数组遍历

class Demo3 {
public static void main(String[] args) {
	//定义一个二维数组
	int [] [] arr={{1,2,3},{4,5},{6}};
	//请问谁来代表{1,2,3}
	//arr[0]代表{1,2,3}
	for(int x=0;x<arr[0].length;x++){
		System.out.println(arr[0][x]);
	}
	System.out.println("-------------------------");
	for(int x=0;x<arr[1].length;x++){
		System.out.println(arr[1][x]);
	}
	System.out.println("-------------------------");
	for(int x=0;x<arr[2].length;x++){
		System.out.println(arr[2][x]);
	}
	System.out.println("-------------------------");

//用循环改进
for(int x=0;x<3;x++){
	for(int y=0;y<arr[x].length;y++){
		System.out.println(arr[x][y]+" ");
	}
	System.out.println();
}

System.out.println("-------------------------");


//再改进
//外循环控制的是二维数组的个数，其实就是一维数组的个数
for(int x=0;x<arr.length;x++){
	for(int y=0;y<arr[x].length;y++){
		System.out.println(arr[x][y]+" ");
	}
	System.out.println();
}
System.out.println("-----------------------");
printArray(arr);
int [] [] arr2={{1,2,3},{4,5},{6}};
printArray(arr2);
}
//用方法改进
//需求：遍历二维数组
//两个明确：返回值：void     参数列表：int [] [] arr
public static  void printArray(int [] [] arr){
	for(int x=0;x<3;x++){
	for(int y=0;y<arr[x].length;y++){
		System.out.println(arr[x][y]+" ");
	}
	System.out.println();
	}
}
}
