import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;

public class OtherMarkdownParseTest {
    /*@Test
    public void snippet1() throws IOException{
        ArrayList<String> correct = new ArrayList<>();
        correct.add("'google.com");
        correct.add("google.com");
        correct.add("ucsd.edu");
        String test = Files.readString(Path.of("test4.md"));
        ArrayList<String> testLinks = OtherMarkdownParse.getLinks(test);
        assertEquals(correct, testLinks);
    }
    @Test
    public void snippet2() throws IOException{
        ArrayList<String> correct = new ArrayList<>();
        correct.add("b.com");
        correct.add("a.com(())");
        correct.add("example.com");
        String test = Files.readString(Path.of("test5.md"));
        ArrayList<String> testLinks = OtherMarkdownParse.getLinks(test);
        assertEquals(correct, testLinks);
    }*/
    @Test
    public void snippet3() throws IOException{
        ArrayList<String> correct = new ArrayList<>();
        correct.add("https://www.twitter.com");
        correct.add("https://ucsd-cse15l-w22.github.io/");
        correct.add("https://cse.ucsd.edu/");
        String test = Files.readString(Path.of("test6.md"));
        ArrayList<String> testLinks = OtherMarkdownParse.getLinks(test);
        assertEquals(correct, testLinks);
    }
}