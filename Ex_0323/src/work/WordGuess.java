package work;

import java.util.Random;

public class WordGuess {
	String[] arr = {"hope", "view", "apple"};
	
	public String Generator() {
		return arr[new Random().nextInt(arr.length)];
	}
	
	public String Scribbler(String word) {
		String abomination = "";
		char temp;
		
		while () {
			word.split();
		}
		
		for (int i = 0; i < word.length(); i++) {
			int intAt = new Random().nextInt(word.length() - i);
			temp = word.charAt(intAt);
			abomination += temp;
			word.
		}
		
		return abomination;
	}
}
