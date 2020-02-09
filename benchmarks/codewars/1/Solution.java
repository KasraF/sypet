public class Solution {

    public static String abbreviate(String name) {
        String[] words = name.split(' ');
        return words[0].substring(0,1) + "." + words[1].substring(0,1);
    }
}

