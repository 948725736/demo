package 二维数组;
/*公司年销售额求和
 * 某公司按照季度和月份的统计的数据如下：单位（万元）
 * 第一季度： 22,66,44
 * 第二季度：77,33,88
 * 第三季度：25,45,65
 * 第四季度：11,66,99
 * 分析：		A:把题目的数据用二维数据来表示
 * 					B:求和就是获取到每一个元素，然后累加起来
 * 					C:定义一个求和变量sum
 * 					D:通过遍历就可以得到每一个二维数组的元素
 * 					E:把元素累加就可以
 * 					F:最后输出sum就是结果
 * */
public class Demo4 {
public static void main(String[] args) {
	int [] [] arr={{ 22,66,44},{77,33,88},{25,45,65},{11,66,99}};
	int sum=0;
	for(int x=0;x<arr.length;x++){
		for(int y=0;y<arr[x].length;y++){
			sum+=arr[x][y];
		}
	}
	System.out.println("一年的销售额为:"+sum+"万元");
}
}
