package me.xtu2014551617.problem008;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xtu2014551617 on 19/8/12.
 * @see <a href="https://leetcode.com/problems/string-to-integer-atoi/">
 *  008. string-to-integer-atoi</a>
 *  字符串转数字
 */

class Solution {
    private static final String regex = "^\\s*?([-+]?\\d+)";
    private static final Pattern pattern = Pattern.compile(regex);
    public int myAtoi(String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String ansStr = matcher.group(1);
            try {
                return Integer.valueOf(ansStr);
            } catch (NumberFormatException e) {
                if (ansStr.startsWith("-")) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
        } else {
            return 0;
        }
    }
}