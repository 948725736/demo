package һά����;
/*��̬��ʼ����
   ��������[]������ = new ��������[���鳤��];
     int []arr=new int[3];
  	
  	��λ�ȡ�����е�Ԫ�أ�
  	ͨ����������[����]
  	��������ÿ��Ԫ�صı�ţ������Ǵ�0��ʼ�������������ĳ��ȼ�1�������±�
 */
public class Demo {
	public static void main(String[] args) {
		int []arr=new int [3];
		/*��ߣ�
		 * int:˵������������int ����
		 * []��˵������һ������
		 * arr������������
		 * �ұߣ�
		 * new��Ϊ�������ռ�
		 * int��˵�������е�Ԫ�ص�����������int����
		 * []:˵������һ������
		 * 3�����鳤�ȣ�Ҳ����������Ԫ�صĸ���
		 * 
		 * */
		System.out.println(arr);//[I@1db9742������ǵ�ֵַ
		//��ʵ�����е�ÿ��Ԫ�����б�ŵģ������Ǵ�0��ʼ�������������ĳ��ȼ�1
		//���������ͱ�ŵ���ϾͿ��Ի�ȡ�����е��ƶ���ŵ�Ԫ�أ���������
		//ͨ���������������ݵĸ�ʽ�ǣ�������[����];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("-------------------");
		//�����鸳ֵ
		arr[0]=100;
		arr[2]=90;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
