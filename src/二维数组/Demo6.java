package 二维数组;
/*某个公司采用公共电话传递数据信息，数据是小于8位数的整数，为了确保安全
 * 在传递过程中组要加密，加密规则如下：
 * 首先将数据倒序，然后将每位数字都加上5，再用和除以10 的余数代替该数字
 * 最后将第一位和最后一位数字交换，请任意给定一个小于8位数的整数
 * 然后，吧加密后的结果在控制台打印
 * 
 * 题目要求：
 * A:数据是小于8位数的整数
 * 定义一个int类型的数据
 * int number=123456；
 * B:加密规则：
 * a.首先将数据倒序，结果是654321
 * b.然后将每位数字都加上5，再用和除以10 的余数代替该数字  结果109876
 * c.最后将第一Wie和最后一位数字交换  结果 609871
 * C；把加密后的结果输出在控制台
 * 
 * 通过简单的分析：我们知道如果我们有办法把这个数据变成数组就好了
 * 不是直接写成int [] arr={1,2,3,4,5,6}
 * 如何把数据转成数组呢？
 * A:定义一个数据：
 * int number=123456;
 * B:死你同意一个数组，这个时候问题来了，数组的长度是多少呢
 * int[] arr=new int [8];  不可能超过8
 * 在赋值的时候，用一个变量记录索引的变化
 * 定义一个索引值是0
 * int index=0;
 * C:获取每一个数据：
 * int ge=number%10
 * int shi=number/10%10
 * int bai=number/10/10%10
 * arr[index]=ge;
 * index++;
 * arr[index]=shi;
 * index++;
 * .........
 * D:
 * */
public class Demo6 {
public static void main(String[] args) {
	//定义一个数据
	int number=123456;
	//定义一个数组
	int[] arr=new int[8];
	//把数据中每一位上的数据获取到之后存贮到数组中
	/*int index=0;
	arr[index]=number%10;
	index++;
	arr[index]=number/10%10;
	index++;
	arr[index]=number/10/10%10;
	index++;*/
	//通过循环改进
	int index=0;
	while(number>0){//number=123456,number=12345,number=1234,number=123,number=12,number=1,number=0
		arr[index]=number%10;//arr[0]=6,arr[1]=5,arr[2]=4,arr[3]=3,arr[4]=2,arr[5]=1
		index++;//index=1,index=2,index=3,index=4,index=5,index=6
		number/=10;//number=12345,number=1234,number=123,number=12,number=1,number=0
	}
	//然后将每位数字都加上5，再用和除以10的余数代替该数字
			for(int x=0; x<index; x++) {
				arr[x] += 5;
				arr[x] %= 10;
			}
			
			//最后将第一位和最后一位数字交换
			int temp = arr[0];
			arr[0] = arr[index-1];
			arr[index-1] = temp;
			
			//输出数据
			for(int x=0; x<index; x++) {
				System.out.print(arr[x]);
			}
			System.out.println();
}
}
