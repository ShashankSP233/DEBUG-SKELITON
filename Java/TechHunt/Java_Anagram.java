// 1.)	VALID ANAGRAM
// Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are anagrams of each other.


package TechHunt;
import java.util.HashMap;

public class Java_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<char, int> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(s.charAt(i), map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return;
            }
        }
        return map.isEmpty(); 
      }

    public static void main(String args[]) {
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));
    }
}
