package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * HashTable 与 HashMap
 * 1.HashMap是线程不安全的，HashTable是线程安全的。
 * HashMap效率比HashTable高，多线程环境使用HashTable
 * 2.HashTable不允许使用null作为key，也不能使用null作为value;
 * HashMap允许使用null作为key，也允许使用null作为value
 * 3.在类结构上，HashTable还继承Dictionary类
 */
public class MapDemo2 {
public static void main(String[] args) {
Map<String,String>map=new HashMap<String,String>();
Hashtable<String,String>table=new Hashtable<String,String>();
table.put("1", "1");
table.put("2", "2");
table.put("3", "3");

Iterator it=map.keySet().iterator();
while(it.hasNext()){
	String key=(String)it.next();
	System.out.println(key+"===="+map.get(key));
}
/*map.put("邓超", "孙俪");
map.put("黄晓明", "杨颖");
map.put("周杰伦", "蔡依林");
map.put("刘恺威", "杨幂");
Set<Map.Entry<String,String>> set=map.entrySet(); 
Iterator<Entry<String, String>> it= set.iterator();
//while(it.hasNext()){
	//Map.Entry<String,String> key=it.next();
	//System.out.println(key);
//}
for(Map.Entry<String,String > key:set){
	System.out.println(key);
}
System.out.println("get:"+map.get("周杰伦"));
System.out.println("get:"+map.get("周杰"));*/
System.out.println(map);
System.out.println(table);
	}
}

