package һά����;
/*����Ԫ������
 * ������
 * ����һ�����飬�����о�̬��ʼ��
 * ˼·��			��0�±��arr.length-1�����ݽ���
 * 						��1�±��aee.length-2�����ݽ���
 * 						��������
 * */
public class Demo6 {
	public static void main(String[] args) {
		int arr[]={211,332,34,23,1232};
		//����ǰ
		System.out.println("����ǰ��");
		printArray1(arr);
		//�����
		System.out.println("�����");
		//reverse(arr);
		reverse2(arr);
		printArray1(arr);
		/*
		 * ������������
		 * ������ȷ�� ����ֵ���ͣ�void
		 * �����б�:int arr[]
		 * */
		
	}

	public static void reverse(int []arr){
//		��һ�ν���
//		int temp=arr[0];
//		arr[0]=arr[arr.length-1];
//		arr[arr.length-1]=temp;
//		�ڶ��ν���
//		int temp=arr[1];
//		arr[1]=arr[arr.length-1-1];
//		arr[arr.length-1-1]=temp;
		//��ѭ���Ľ�
		for(int x=0;x<arr.length/2;x++){
			int temp=arr[x];
			arr[x]=arr[arr.length-1-x];
			arr[arr.length-1-x]=temp;
		}
	}
	public static void reverse2(int []arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
//	public static void printArray(int arr[]){
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
//	}
	//��������
	public static void printArray1(int arr[]){
		System.out.println("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){//�������һ��Ԫ��
				System.out.println(arr[x]+"1");
			}else{
				System.out.println(arr[x]+",");
			}
		}
	}
}
