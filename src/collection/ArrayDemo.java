package collection;

import java.util.Arrays;
import java.util.List;
//public static <T> List<T>asList(T.....a):������תΪ����
//����תΪ���Ϻ��ʻ���һ�����飬
//�䳤�Ȳ����Ը��ģ����Բ���ʵ����Ӻ��Ƴ��Ĺ���
//HashSet:������֤set�ĵ���˳���ر��ǲ���֤˳���ò���
//��Ȼset���ϵ�Ԫ�����򣬵�����Ϊ������˵�����Լ��Ĵ洢˳��
//ż�����˳������Ĵ洢˳��һ�����ⲻ�ܴ�������
//����Զ�洢�����ܿ���Ч��
public class ArrayDemo {
public static void main(String[] args) {
	String[]strArray ={"hello","world","java"};
	List<String>list=Arrays.asList(strArray);
	for(String s:list){
		System.out.println(s);
		 
	}
}
}
