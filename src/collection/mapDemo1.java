package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo1 {
	/*
	 * map���ϵı���
	 * ˼·��
	 * 			A:��ȡ���еļ�
	 * 			B:�������ļ��ϣ���ȡ��ÿһ����
	 * 			C:���ݼ�ȥ��ֵ
	 * */
public static void main(String[] args) {
	//�������϶���
	Map<String,String>map=new HashMap<String,String>();
	//��Ӽ���Ԫ��
	map.put("�˳�", "��ٳ");
	map.put("������", "��ӱ");
	map.put("�ܽ���", "������");
	map.put("������", "����");
	//����
	//��ȡ���еļ�
	Set<String>set=map.keySet();
	//�������ļ��ϣ���ȡ��ÿһ����
	for(String key:set){
		//���ݼ�ȥ��ֵ
		String value=map.get(key);
		System.out.println(key+"--------------"+value);
	}
}
}
