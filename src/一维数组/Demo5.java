package һά����;
/*��ȡ�����е���ֵ
 * ������
  	A:����һ�����飬���������Ԫ�ؽ��о�̬��ʼ��
  	B:��������������һ��Ԫ����Ϊ������(һ��ȡ��һ��),Ĭ�����������ֵ
  	C: Ȼ�����������Ԫ�أ����λ�ȡ�Ͳ�������бȽϣ������������������С�����뿪
  	D:�����������汣��ľ������ֵ
 * */
public class Demo5 {
public static void main(String[] args) {
	//����һ������
	int []arr={34,90,23,2312,123,89};
	//��ȡ�����е����ֵ
//	int max=arr[0];
//	for(int i=1;i<arr.length;i++){
//		if(arr[i]>max){
//			max=arr[i];
//		}
//	}
//	System.out.println("max:"+max);
	//�����ô���Ľ�
	//���÷���
	int max=getMax(arr);
	System.out.println("max:"+max);
}
	/*
	 * ������ȷ��
	 * ����ֵ���ͣ�int
	 * �����б� int []arr
	 * */
	public static int getMax(int [] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){//���д��Сֵ�����ڸĳ�С�ھͿ���
				max=arr[i];
			}
		}
		return max;
	}
	//��ȡ�����е���Сֵ
	

}
