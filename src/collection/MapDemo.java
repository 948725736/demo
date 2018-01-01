package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	//创建集合对象
	Map<String,String> map=new HashMap<String,String>();
/*	
 * //添加元素
	// V put(K key,V value);除了添加功能以外还有另外的功能
	//如果键是第一次存储，就直接存储元素，返回null
	//如果键不是第一次存储，就用值把以前的值替换掉，并把值返回
	System.out.println("put:"+map.put("文章", "马伊琍"));
	//文章为键，马伊琍为键映射的值
	System.out.println("put:"+map.put("文章", "姚笛"));
	//输出集合名称
	System.out.println("map:"+map);
	
	*/
	map.put("邓超", "孙俪");
	map.put("黄晓明", "杨颖");
	map.put("周杰伦", "蔡依林");
	map.put("刘恺威", "杨幂");
	System.out.println("get:"+map.get("周杰伦"));
	//由键获取值，所以当输入周杰伦的时候，输出蔡依林
	System.out.println("get:"+map.get("周杰"));
	//因为没有周杰这个键， 所以输出来的值是null
	 
	 System.out.println("-----------------------------------");
	 //Set<k>keySet():获取集合中所有键的集合
	 Set<String>set=map.keySet();
	 for(String key : set){
		 System.out.println(key);
	 }
	 System.out.println("-----------------------");
	 //collection<v> values():获取集合中所有值的集合
	 Collection <String>con =map.values();
	 for(String value:con){
		 System.out.println(value);
	 }
}
}
