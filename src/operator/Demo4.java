package operator;

/*
 * ��Ŀ�������~3
 * ˫Ŀ�������3+4
 * ��Ŀ�����
 * ��ʽ��(�Ƚϱ��ʽ)��(���ʽ1):(���ʽ2);
 * �Ƚϱ��ʽ�������ͼ����boolean����
 * ִ�����̣�
 * ���ݱȽϱ��ʽ�ļ��㷵��һ��true����false
 * �����true���Ͱѱ��ʽ1��Ϊ���
 * �����false���Ͱѱ��ʽ2��Ϊ���
 * */
public class Demo4 {
	//@Test
public void test(){
	int x=100;
	int y=200;
	//int z=((x>y)? x:y );���ZΪ200
	//int z=((x<y)? x:y);���ZΪ100
	int z=((x==y)? x:y);//���zΪ200
	System.out.println("z:"+z);
}
//@Test
	public void test2(){
		//��ȡ���������е����ֵ
	int x=100;
	int y=200;
	int max=(x>y ? x:y);
	System.out.println("max:"+max);
	System.out.println("------------------");
	//��ȡ��������������ֵ
	int a=10;
	int b=30;
	int c=20;
	//��������
	//A:�ȱȽ�ab�����ֵ
	//B:��ab�����ֵ�ٺ�c���бȽ�
	
	int temp=((a>b)? a:b);
	//System.out.println(temp);
	int max1=(temp>c ? temp:c);
	System.out.println("max1:"+max1);
	//һ���㶨
	int max2=(a>b)?((a>c)?a:c):((b>c)?b:c);
	//int max2=a<b?a>c?a:c:b>c?b:c;
	System.out.println("max2:"+max2);
	System.out.println("--------------------");
	//�Ƚ��������Ƿ�һ��
	int m=100;
	int n=200;
	
	//boolean flag=(m==n)? true:false;
	//��Ϊ==��������boolean�������Բ���Ҫ��ôд��ֱ������Ϳ���
	boolean flag= m==n;
	System.out.println(flag);
	}
}
