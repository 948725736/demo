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

	Iterator it=list.iterator();//用迭代器遍历旧的集合，获取旧集合中的每一个元素
	while(it.hasNext()){
		String s=(String)it.next();
		if(!newlist.contains(s)){//！表示不包括的意思
			newlist.add(s);//判断新集合中是否有旧集合中你要找的元素，没有就加进去
		}
	}
	for(int x=0;x<newlist.size();x++){//遍历新集合
		String s=(String)newlist.get(x);
		System.out.println(s);
	}
}
}
