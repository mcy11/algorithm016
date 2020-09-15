package pratice.week2.first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-14 13:55
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                sMap.put(sChar, sMap.get(sChar) + 1);
            }else {
                sMap.put(sChar, 1);
            }
            if(tMap.containsKey(tChar)){
                tMap.put(tChar, tMap.get(tChar) + 1);
            }else {
                tMap.put(tChar, 1);
            }
        }

        return sMap.equals(tMap);
    }

    public boolean isAnagram2(String s, String t) {
        byte[] bytes = s.getBytes();
        byte[] bytes1 = t.getBytes();

        Arrays.sort(bytes);
        Arrays.sort(bytes1);

        return Arrays.equals(bytes, bytes1);
    }

    public boolean isAnagram3(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int letterArray[] = new int[26];

        for (int i = 0; i < s.length(); i++){
            letterArray[s.charAt(i) - 'a']++;
            letterArray[t.charAt(i) - 'a']--;
        }

        for (int i : letterArray) {
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}
