import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        String regExp = "\\b((([2])([0-5])([0-5])|([1][0-9][0-9])\\b)|(([1-9])([0-9]))|([1-9])\\b)\\.(\\d+\\.)(\\d+\\.)(\\d+)";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}