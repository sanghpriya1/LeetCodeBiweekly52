

public class SortSentence {
//	private static String charRemoveAt(String str, int p) {  
//        return str.substring(0, p) + str.substring(p + 1);  
//     }  
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		String[] words = s.split("\\s");
		
		int len = words.length;
		String[] sort_words = new String[len];
		
		for(int i = 0; i < len; i++) {
			String k = words[i];
			int t = k.length()-1;
			int x = k.charAt(t) - '0';
			String ans = "";
			for(int j = 0; j < t; j++) {
				ans += k.charAt(j);
			}
			
			sort_words[x-1] = ans;
			
			
			
		}
		String sorted_word = "";
		for(int i = 0; i < len; ++i) {
			sorted_word += sort_words[i];
			if(i != len -1)
			sorted_word += " ";
		}
		System.out.println(sorted_word);
		
	}

}
