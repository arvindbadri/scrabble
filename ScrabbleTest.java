
import static org.junit.Assert.*;

import org.junit.Test;

public class ScrabbleTest {
 
	Scrabble scrab = new Scrabble();
	
	@Test
    public void checkOdometerTest(){
		String rack = "aaazeta";
        int[] scores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        char[] rackArr = rack.toCharArray();
        Arrays.sort(rackArr);
        ArrayList<String> words = getWordsFromFile("C:\\Users\\desriram\\workspace\\Anagrams\\src\\sowpods.txt");
        ArrayList<String> wordsCopy = (ArrayList<String>) words.clone();
        scrab.sortAllWords(wordsCopy);
        HashMap<String, ArrayList<Integer>> hash = scrab.putIntoHashMap(wordsCopy);
        scarb.makeCombinationsAndCheck(hash,rack,scores,words);
        assertEquals(true, scrab.getMaxWord());
    }
	
}