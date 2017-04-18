package example.codeclan.com.wordcounter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 18/04/2017.
 */

public class WordCountTest {

@Test
    public void testCountWords(){
    WordCount wordcount = new WordCount();
    assertEquals(5, wordcount.countWords("Hello this contains five words"));
}

}
