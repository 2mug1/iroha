package net.iamtakagi.iroha;

import com.google.common.base.CharMatcher;

import java.util.regex.Pattern;

public class JavaUtil {

    private static final CharMatcher CHAR_MATCHER_ASCII = CharMatcher.inRange('0', '9').or(CharMatcher.inRange('a', 'z')).or(CharMatcher.inRange('A', 'Z')).or(CharMatcher.whitespace()).precomputed();
    private static final Pattern UUID_PATTERN = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[34][0-9a-fA-F]{3}-[89ab][0-9a-fA-F]{3}-[0-9a-fA-F]{12}");

    public static boolean isAlphanumeric(String string) {
        return CHAR_MATCHER_ASCII.matchesAllOf(string);
    }

    public static boolean isUUID(String string) {
        return UUID_PATTERN.matcher(string).find();
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
