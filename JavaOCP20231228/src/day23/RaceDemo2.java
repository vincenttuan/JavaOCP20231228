package day23;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class RaceDemo2 {
	public static void main(String[] args) {
		// 12 生肖跑步比賽
		Map<String, Race> map = new LinkedHashMap<>();
		map.put("鼠", new Race());
		map.put("牛", new Race());
		map.put("虎", new Race());
		map.put("貓", new Race());
		// 設定執行緒名字
		map.entrySet().forEach(entry -> {
			Race race = entry.getValue();
			race.setName(entry.getKey());
		});
		
		// 取出 values()
		Collection<Race> values = map.values();
		
		// 開跑(逐一)
		//values.stream() 
		//	  .forEach(race -> race.start());
		
		// 開跑(併行)
		values.parallelStream()
			  .forEach(race -> race.start());
	}
}
