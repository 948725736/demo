package function;
/*void�ĵ�������
 * ��������
 * ��ֵ���ã�����������ʹ�ã�
 * ������ã���������ʹ�ã�
 * */
public class Demo3 {
public static void main(String[] args) {
	//�������һ��6��7�е�����ͼ��
	for(int i=0;i<6;i++){
		for(int j=0;j<7;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("---------------------------");
	//��������
	pringxing(3,4);
	System.out.println("----------------------------");
	pringxing(6,7);//����pringxing��ķ���
	System.out.println("--------------------------");
	//�������
	//�˴�������ʹ�á��ա�����
	//System.out.println(pringxing(3,4));  ����ʽ
	//��ֵ����
	//�Ƿ��ı��ʽ
	//void v=pringxing(3,4);
}
/*дһ��m��n�еĴ���
 * ������ȷ��
 * ����ֵ���ͣ��������û����ȷ�ķ���ֵ����д����Ҳ���У�������void
 * �����б� int m,int n
 * */
public static void pringxing(int m,int n){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			System.out.print("*");
		}
		System.out.println();
	}
System.out.println("--------------------------------");
} 

}
