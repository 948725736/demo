package operator;

public class Demo {
public static void main(String[] args) {
	//short s=1;
	//s=s+1;
	//System.out.println(s);
	//此运算不成立，会使运算失去精度，short在参与运算之前需要转化为int类型
	short s=1;
	s+=1;//此处不是s=s+1,而是s=(s的数据类型)(s+1);
	System.out.println(s);
	//扩展的运算符其实隐含了一个强制的类型转换,所以此次运算成立
	
}
}
