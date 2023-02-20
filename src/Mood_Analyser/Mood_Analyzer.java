package Mood_Analyser;

import java.util.Scanner;

public class Mood_Analyzer {

		String moodAnalyzer(String message) throws Mood_Analyzer_Exceptions {
				if(message.contains("SAD")) {
					return "SAD";
				}else if(message.contains("HAPPY")) {
					return "HAPPY"; 
				}else {
					throw new Mood_Analyzer_Exceptions("Invalid Mood...");
				}
		}
		
		
		public static void main(String[] args) {
			
			Mood_Analyzer moodAnalyzer = new Mood_Analyzer();
			Scanner getInput = new Scanner(System.in);
			
			System.out.println("Tell me in one sentance what you feel :: ");
			System.out.println("========");
			try {
			System.out.println(moodAnalyzer.moodAnalyzer(getInput.next()));
			}catch(Mood_Analyzer_Exceptions e) {
				System.err.println(e);
				System.out.println("-- THATS A WEIRD MOOD --");
			}catch(Exception e) {
				System.err.println(e);
			}
			System.out.println("========");
			

		}
}
