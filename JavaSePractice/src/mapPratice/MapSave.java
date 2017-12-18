package mapPratice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapSave {
	
	/**
	 * 这个是练习如何用map去实现存储表
	 */
	public static void main(String[] args){
		
		Map map = new HashMap();
		//把需要的东西往mapl里面放,前面是字段都是需要用String类型
		map.put("name", "王伟");
		map.put("ID", "16180600211");
		map.put("age", 20);
		
		Map map2 = new HashMap();
		map2.put("name", "葛豪");
		map2.put("ID", "16180600209");
		map2.put("age", 20);
		
		HashMap<String, String> map3 = new HashMap<>();
		
		
		
		System.out.println(map3.get(map2));
		
	}

}
