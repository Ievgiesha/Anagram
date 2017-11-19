import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ievgenia on 19.11.2017.
 */
public class AnagramTest {

    @Test
    public void shouldTakeAnagramAndReturnTrue(){
        //given


        //when
       boolean result =  Anagram.isAnagram("window","wodniw");

       //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldTakeNotAnagramAndReturnFalse(){
        //given


        //when
        boolean result = Anagram.isAnagram("Stringin","strinnng");

        //then
        Assert.assertFalse(result);
    }
    @Test
    public void shouldTakeNotAnagramSoLongReturnFalse() {
        //given
//вот русский комментарий
        //when
        boolean result = Anagram.isAnagram("more", "moremore");

        //then
        Assert.assertFalse(result);
    }

}
