package operator;
/*
 * �߼������
 * ^��|��^,!
 * ^^,||
 * �ص㣺 �߼������һ����������boolean���͵ı��ʽ����ֵ
 * 
 * ���ʽ��������������ѳ������߱������������ĸ���Java�﷨��ʽ��
 * 
 * &&��&������||��|������
 * 		A:���յĽ��һ��
 * 		B:&&���ж�·Ч���������falseʱ���ұ߲�ִ��
 * 
 * */
public class Demo2 {
public static void main(String[] args) {
	int a=3;
	int b=4;
	int c=5;
	// &���ҵ�ʱ����һ��Ϊfalse��Ϊfalse
	System.out.println((a>b)&(a>c));//false & false = false
	System.out.println((a>b)&(a<c));//false & true = false
	System.out.println((a<b)&(a>c));//true & false = false
	System.out.println((a<b)&(a<c));//true & true = true
	System.out.println("-------------------------------------");
	// |���ߵ�ʱ����һ��Ϊtrue�����еĶ�Ϊtrue
	System.out.println((a>b)|(a>c));//false | false = false
	System.out.println((a>b)|(a<c));//false | true = true
	System.out.println((a<b)|(a>c));//true | false = true
	System.out.println((a<b)|(a<c));//true |true = true
	System.out.println("-----------------------");
	// ^�߼�����ʱ��������ͬ�Ĳ�������false���������ز�һ������true
	System.out.println((a>b)^(a>c));//false ^ false = false
	System.out.println((a>b)^(a<c));//false ^ true =  true
	System.out.println((a<b)^(a>c));//true ^ false =  true
	System.out.println((a<b)^(a<c));//true ^ true = false
	System.out.println("-------------------------------");
	// !�߼��Ƿ�false��true��ż���������ı䱾�������ı�
	System.out.println(!(a>b));//!false=true
	System.out.println(!(a<b));//!true=false
	System.out.println(!!(a>b));//!!false=false
	System.out.println(!!!(a<b));//!!!false=true
	System.out.println("----------------------------------");
	System.out.println((a>b)&&(a>c));//false && false = false
	System.out.println((a>b)&&(a<c));//false && true = false
	System.out.println((a<b)&&(a>c));//true && false = false
	System.out.println((a<b)&&(a<c));//true && true = true
	System.out.println("----------------------------");
	int x=3;
	int y=4;
	//boolean b1=(x++ == 3 & y++ == 4);//x:4,y:5  true
	//boolean b1=(x++ == 3 && y++ == 4);//x:4,y:5  true
	boolean b1=(++x == 3 && y++ == 4);//x:4,y:4  false
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	System.out.println(b1);
}
}
