package snippet;

public class Modifyingstrings {
	
	public void lyToEst (String word) {
		
		word = word.substring(0, word.length()-2 ) + "est";
		
		System.out.println(word);
		
	}
	
	public void preToun(String word) {
		
		word = "un" + word.substring(3);
		
		System.out.println(word);
		
	}
	
	public void changeEToQ(String word) {
		
		word = "hello everyone";
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == 'e') {
				word = word.substring(0,i) + "q" + word.substring(i+1);
			}
			
		}
		
		System.out.println(word);
		
	}
	
	public void occurance(String word, char letter1, char letter2) {
		
		
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter1) {
				
				word = word.substring(0, word.charAt(i)) + letter2 + word.substring(word.charAt(i+1));
				
			}
			
		}
		
	}
	
	public void sentence2(String sentence) {
		
		String[] arr = new String[sentence.length()];
		
		String firstone = "";
		
		for (int i = 0; i < sentence.length(); i++) {
			
			if (i == 1) {
				while(sentence.charAt(i) != ' ') {
					firstone += sentence.charAt(i);
				}
			}
			
			if (sentence.charAt(i) == ' ') {
				
	
				arr[i] = sentence.substring(sentence.charAt(i+1));
				
				
			}
			
		}
		
		System.out.println(firstone);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	
}

