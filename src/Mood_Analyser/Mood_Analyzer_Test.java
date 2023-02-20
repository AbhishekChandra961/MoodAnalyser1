package Mood_Analyser;

import org.junit.Test;

public class Mood_Analyzer_Test {

	@Test
	public void moodAnalyzerHappyTest() {
		Mood_Analyzer moodAnalyzer = new Mood_Analyzer();
		assertEquals("HAPPY",moodAnalyzer.moodAnalyzer("JAVA HO TO DO HAPPY"));
	}
	@Test
	public void moodAnalyzerSadTest() {
		Mood_Analyzer moodAnalyzer = new Mood_Analyzer();
		assertEquals("SAD",moodAnalyzer.moodAnalyzer("SAD HO TO DO JAVA"));
	}
}
