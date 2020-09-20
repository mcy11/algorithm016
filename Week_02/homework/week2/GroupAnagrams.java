package homework.week2;

import java.util.*;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-14 14:32
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> resultMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortString = String.valueOf(chars);
            if(!resultMap.containsKey(sortString)){
                resultMap.put(sortString, new ArrayList<>());
            }
            resultMap.get(sortString).add(str);
        }

        return new ArrayList<>(resultMap.values());
    }
}
