package collection;

import java.util.Arrays;
import java.util.List;
//public static <T> List<T>asList(T.....a):把数组转为集合
//数组转为集合后本质还是一个数组，
//其长度不可以更改，所以不能实现添加和移除的功能
//HashSet:他不保证set的迭代顺序，特别是不保证顺序恒久不变
//虽然set集合的元素无序，但是作为集合来说他有自己的存储顺序
//偶尔你的顺序和他的存储顺序一样，这不能代表有序
//你可以多存储，就能看到效果
public class ArrayDemo {
public static void main(String[] args) {
	String[]strArray ={"hello","world","java"};
	List<String>list=Arrays.asList(strArray);
	for(String s:list){
		System.out.println(s);
		 
	}
}
}
