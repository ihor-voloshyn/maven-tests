package lesson11;

import org.apache.commons.lang3.StringUtils;

public class StringAbbreviationUtil {
    public static String abbreviateString(String str, int maxWidth) {
        return StringUtils.abbreviate(str, maxWidth);
    }
}
