package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList array=new ArrayList();
	array.add("����");
	array.add("�Ǻ�");
	array.add("����");
	array.add("�ٺ�");
	array.add("hhhh");
	array.add("����");
	array.add("�Ǻ�");
	array.add("����");
	array.add("�Ǻ�");
	System.out.println(array);
	//��ѡ������˼�����룬����ͨ�����˼����
	//��0���������κͺ���ıȽϣ��оͰѺ���ĸɵ�
	//ͬ����1����
	for(int i=0;i<array.size();i++){
		for(int j=i+1;j<array.size();j++){
			if(array.get(i).equals(array.get(j))){
				array.remove(j);
				j--;
			}
		}
	}
	Iterator it=array.iterator();//��������
	while(it.hasNext()){
		String s=(String)it.next();
		System.out.println(s);
	}
}
}
