package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * HashTable �� HashMap
 * 1.HashMap���̲߳���ȫ�ģ�HashTable���̰߳�ȫ�ġ�
 * HashMapЧ�ʱ�HashTable�ߣ����̻߳���ʹ��HashTable
 * 2.HashTable������ʹ��null��Ϊkey��Ҳ����ʹ��null��Ϊvalue;
 * HashMap����ʹ��null��Ϊkey��Ҳ����ʹ��null��Ϊvalue
 * 3.����ṹ�ϣ�HashTable���̳�Dictionary��
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
/*map.put("�˳�", "��ٳ");
map.put("������", "��ӱ");
map.put("�ܽ���", "������");
map.put("������", "����");
Set<Map.Entry<String,String>> set=map.entrySet(); 
Iterator<Entry<String, String>> it= set.iterator();
//while(it.hasNext()){
	//Map.Entry<String,String> key=it.next();
	//System.out.println(key);
//}
for(Map.Entry<String,String > key:set){
	System.out.println(key);
}
System.out.println("get:"+map.get("�ܽ���"));
System.out.println("get:"+map.get("�ܽ�"));*/
System.out.println(map);
System.out.println(table);
	}
}

