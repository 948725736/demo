package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList array=new ArrayList();
	array.add("哈哈");
	array.add("呵呵");
	array.add("哈哈");
	array.add("嘿嘿");
	array.add("hhhh");
	array.add("哈哈");
	array.add("呵呵");
	array.add("哈哈");
	array.add("呵呵");
	System.out.println(array);
	//由选择排序思想引入，可以通过这个思想解决
	//拿0索引的依次和后面的比较，有就把后面的干掉
	//同理，拿1索引
	for(int i=0;i<array.size();i++){
		for(int j=i+1;j<array.size();j++){
			if(array.get(i).equals(array.get(j))){
				array.remove(j);
				j--;
			}
		}
	}
	Iterator it=array.iterator();//遍历集合
	while(it.hasNext()){
		String s=(String)it.next();
		System.out.println(s);
	}
}
}
