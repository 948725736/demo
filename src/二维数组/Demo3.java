package ��ά����;
//��ά�������

class Demo3 {
public static void main(String[] args) {
	//����һ����ά����
	int [] [] arr={{1,2,3},{4,5},{6}};
	//����˭������{1,2,3}
	//arr[0]����{1,2,3}
	for(int x=0;x<arr[0].length;x++){
		System.out.println(arr[0][x]);
	}
	System.out.println("-------------------------");
	for(int x=0;x<arr[1].length;x++){
		System.out.println(arr[1][x]);
	}
	System.out.println("-------------------------");
	for(int x=0;x<arr[2].length;x++){
		System.out.println(arr[2][x]);
	}
	System.out.println("-------------------------");

//��ѭ���Ľ�
for(int x=0;x<3;x++){
	for(int y=0;y<arr[x].length;y++){
		System.out.println(arr[x][y]+" ");
	}
	System.out.println();
}

System.out.println("-------------------------");


//�ٸĽ�
//��ѭ�����Ƶ��Ƕ�ά����ĸ�������ʵ����һά����ĸ���
for(int x=0;x<arr.length;x++){
	for(int y=0;y<arr[x].length;y++){
		System.out.println(arr[x][y]+" ");
	}
	System.out.println();
}
System.out.println("-----------------------");
printArray(arr);
int [] [] arr2={{1,2,3},{4,5},{6}};
printArray(arr2);
}
//�÷����Ľ�
//���󣺱�����ά����
//������ȷ������ֵ��void     �����б�int [] [] arr
public static  void printArray(int [] [] arr){
	for(int x=0;x<3;x++){
	for(int y=0;y<arr[x].length;y++){
		System.out.println(arr[x][y]+" ");
	}
	System.out.println();
	}
}
}
