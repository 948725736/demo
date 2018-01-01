package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo1 {
	/*
	 * map集合的遍历
	 * 思路：
	 * 			A:获取所有的键
	 * 			B:遍历键的集合，获取到每一个键
	 * 			C:根据键去找值
	 * */
public static void main(String[] args) {
	//创建集合对象
	Map<String,String>map=new HashMap<String,String>();
	//添加集合元素
	map.put("邓超", "孙俪");
	map.put("黄晓明", "杨颖");
	map.put("周杰伦", "蔡依林");
	map.put("刘恺威", "杨幂");
	//遍历
	//获取所有的键
	Set<String>set=map.keySet();
	//遍历键的集合，获取到每一个键
	for(String key:set){
		//根据键去找值
		String value=map.get(key);
		System.out.println(key+"--------------"+value);
	}
}
}
