package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	//�������϶���
	Map<String,String> map=new HashMap<String,String>();
/*	
 * //���Ԫ��
	// V put(K key,V value);������ӹ������⻹������Ĺ���
	//������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
	//��������ǵ�һ�δ洢������ֵ����ǰ��ֵ�滻��������ֵ����
	System.out.println("put:"+map.put("����", "�����P"));
	//����Ϊ���������PΪ��ӳ���ֵ
	System.out.println("put:"+map.put("����", "Ҧ��"));
	//�����������
	System.out.println("map:"+map);
	
	*/
	map.put("�˳�", "��ٳ");
	map.put("������", "��ӱ");
	map.put("�ܽ���", "������");
	map.put("������", "����");
	System.out.println("get:"+map.get("�ܽ���"));
	//�ɼ���ȡֵ�����Ե������ܽ��׵�ʱ�����������
	System.out.println("get:"+map.get("�ܽ�"));
	//��Ϊû���ܽ�������� �����������ֵ��null
	 
	 System.out.println("-----------------------------------");
	 //Set<k>keySet():��ȡ���������м��ļ���
	 Set<String>set=map.keySet();
	 for(String key : set){
		 System.out.println(key);
	 }
	 System.out.println("-----------------------");
	 //collection<v> values():��ȡ����������ֵ�ļ���
	 Collection <String>con =map.values();
	 for(String value:con){
		 System.out.println(value);
	 }
}
}
