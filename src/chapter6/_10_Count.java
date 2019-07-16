package chapter6;

public class _10_Count {

	public static void main(String[] args) {

		String str = "";
		int count = 0;
		String s = "";
		
		// string methods: indexOf()
		// usage: object.method()
		// indexOf(str) : find from 0
		// indexOf(str,index) : find from index

		/*
		 * 1. complete countStr()
		 */
		
		// 1. ans = 2
		s = "Show me the money moby";
		str = "mo";
		count = countStr(s, str);
		System.out.println(count + " occurrences of \""+str+"\" in \""+ s + "\"");
		
		// 2. ans = 5
		s = "abaabaaabaaaabaaaaabaa";
		str = "ba";
		count = countStr(s, str);
		System.out.println(count + " occurrences of \"" + str + "\" in \"" + s + "\"");


	}
	
	/**
	 * counts how many occurrences of str can be found in s
	 * @param s
	 * @param str
	 * @return
	 */
	public static int countStr(String s, String str) {

		return 0;
	}
	


}
