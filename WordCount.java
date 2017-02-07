package example;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
		Integer demo[]={10,25,32,65,56,65,10,25,35};
		String str = "Hi Helo Hello Hi hi";
		String[] words = str.split(" ");
		HashMap<?, Integer> map=wordCount(demo);
		System.out.println(map);
	}
	public static <T>HashMap<T,Integer> wordCount(T elemet[]) {
		HashMap<T,Integer> map = new HashMap<T, Integer>();
		for (T string : elemet) {
			if (map.get(string) == null) {
				map.put(string, 1);
			} else {
				int val=(int) map.get(string) + 1;
				map.put( string, val);
			}
		}
		return map;
	}

}
