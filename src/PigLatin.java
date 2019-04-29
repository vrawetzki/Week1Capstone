import java.util.Scanner;

// so this works, well it did the first time, i went through and tried correcting the answers with the suggestions given
// but it seem to have fucked it up more
//i'm still figuring out how.... it constantly makes new methods for me at the bottom,
// im not sure why or what exactly im doing wrong, like i had to add all of those to make it work 

public class PigLatin {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println("Enter a line to be translated: ");
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		String userInput = "";
		// the empty quotes represent what the user will put in
		String userWord = scan.nextLine();
		// I seem to have a variable problem...
		userWord = scan.nextLine();
		
		// I'm using a for loop because its the one i think i understand the best
		for (int i = 0; i < userWord.length(); i++) {
			// this is where the world will be translated
			String pigLatinWord = translateWord(userWord());
			// hopefully this is where the newly translated word will be put in the output
			String output = pigLatinWord + " ";
			
			System.out.println("Original Word: " + userInput);
			// the \n means it will move down a line - like the formatting exercise we had
			System.out.println(output + "\n");
			
		}
		
		// now to make loops for the individual vowels and consonants
		// first build spec is to covert each word to lowerCase
		String translationWord; String word; {
			String lowerCaseWord = word.toLowerCase();
			// looking for the location of the first vowel
			int pos = -1;
			char ch;
			
			// this loop is still first vowel
			int i; 
			for (i = 0; i < lowerCaseWord.length(); i++) { // im sorry im having a hard time
															// with this, when i have 'int' somewhere
															// i constantly get teh error that says it must be a variable,
															// i've created one in the line above
			 String lowerCase;
			ch = lowerCase.charAt(i);
			 
			 if (isVowel(ch)) {
				 pos = i;
				 break;
			 }
			}
			// second loop
			// this is the second build spec
			// which is if the word starts with a vowel, add 'way' onto the end
			for (pos == 0); { // pos = 0 because this is if the vowel if the first letter
				return lowerCaseWord + "way"; // this is adding it ontothe vowel
			} else { // this is the second build spec - where if the word
			 	 //  starts with a consonant, move all of the constants that appear
			 	//   before the first vowel to the end of the word, then add
			 	//   "ay" to the end of the word
				String x = lowerCaseWord.substring(pos); // extracting all characters in word starting after first vowel
				String y = lowerCaseWord.substring(0, pos); // extracting all characters located before the first vowel
				return x + y + "ay"; // adding the 'ay' o
			}
		}
		
		// labeling the vowels, dont believe we need to do it for the consonants
		public static boolean isVowel(char ch){
			if (ch == 'a' || ch == "e" || ch == "i" || ch == "o" || ch == "u") {
			return true;
		} 
			return false;
		}
	}

	private static Object pos(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String translateWord(Object userWord) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		return false;
	}

	private static Object userWord() {
		// TODO Auto-generated method stub
		return null;
	}

}
