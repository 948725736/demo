package һά����;
/*�������������һ����������е�ÿһ��Ԫ��
 * */
public class Demo4 {
	public static void main(String[] args) {
//��������
	int []arr={11,22,33,44,55};
	//��ȡÿһ��Ԫ��
	//��һ�ַ����������������������������ҵ�����
	System.out.println(arr[0]);
	//�ڶ��ַ���:��ѭ������
	for(int i=0;i<5;i++){
		//��������±�С��5��Ԫ��
		System.out.println(arr[i]);
	}
		System.out.println("---------------------------");
		//��0��ʼ��������ȷ�ģ�i<5����Ϊ��������Ԫ����5��
		//������Ԫ�غܶ�ʱ�ı�������
		int[]arr1={1,2,3,4,5,6,7,8,9,10,11,16,17,18,19,20,5,3,51,2,45,56,67,5,6};
		//���������ʱ��������ṩ��һ�����ԣ�length���ڻ�ȡ���鳤��
		//��ʽ��������.length��������ĳ���
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println("-------------------------");
		for(int x=0;x<arr.length;x++){
			System.out.println(arr1[x]);
		}
		
		System.out.println("----------------------------");
		printArray(arr);
		System.out.println("-----------------");
		printArray(arr1);
		System.out.println("-----------------");
		printArray2(arr);
		System.out.println("-----------------");
	}
		//���������Ҫ�Զ��������б�����ÿ������ı�����Ҫ�Ѵ���дһ��̫�鷳
		//����׼���Ľ�
//		������ȷ   �������ͣ�void    �����б�int [] arr  
		public static void printArray(int [] arr){
			for(int x=0;x<arr.length;x++){
				System.out.println(arr[x]);
			}	
		}
		public static void printArray2(int [] arr){
			System.out.print("[");
			for(int x=0; x<arr.length; x++) {
				if(x == arr.length-1) { //������������һ��Ԫ��
					System.out.println(arr[x]+"]");
				}else {
					System.out.print(arr[x]+", ");
				}
			}	
	}
}