package lesson11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringAbbreviationUtilTest {
    @Test
    public void testAbbreviateString() {
        String input = "Привет всем кто живет на луне!";

        String result10 = StringAbbreviationUtil.abbreviateString(input, 10);
        Assert.assertEquals(result10, "Привет ...", "Abbreviation to 10 characters failed");

        String result20 = StringAbbreviationUtil.abbreviateString(input, 20);
        Assert.assertEquals(result20, "Привет всем кто ж...", "Abbreviation to 20 characters failed");
    }
}
