package mapPratice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapSave {
	
	/**
	 * �������ϰ�����mapȥʵ�ִ洢��
	 */
	public static void main(String[] args){
		
		Map map = new HashMap();
		//����Ҫ�Ķ�����mapl�����,ǰ�����ֶζ�����Ҫ��String����
		map.put("name", "��ΰ");
		map.put("ID", "16180600211");
		map.put("age", 20);
		
		Map map2 = new HashMap();
		map2.put("name", "���");
		map2.put("ID", "16180600209");
		map2.put("age", 20);
		
		HashMap<String, String> map3 = new HashMap<>();
		
		
		
		System.out.println(map3.get(map2));
		
	}

}
