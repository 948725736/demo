package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
public static void main(String[] args) {
	ArrayList list =new ArrayList();
	list.add("hello");
	list.add("world");
	list.add("java");
	list.add("hello");
	list.add("world");
	list.add("hello");
	list.add("world");
	System.out.println(list);
	ArrayList newlist=new ArrayList();

	Iterator it=list.iterator();//�õ����������ɵļ��ϣ���ȡ�ɼ����е�ÿһ��Ԫ��
	while(it.hasNext()){
		String s=(String)it.next();
		if(!newlist.contains(s)){//����ʾ����������˼
			newlist.add(s);//�ж��¼������Ƿ��оɼ�������Ҫ�ҵ�Ԫ�أ�û�оͼӽ�ȥ
		}
	}
	for(int x=0;x<newlist.size();x++){//�����¼���
		String s=(String)newlist.get(x);
		System.out.println(s);
	}
}
}
