package pratice.week4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-09 10:36
 */
public class MinMutation {

    public int minMutation(String start, String end, String[] bank) {
        if(start.equals(end)){
            return 0;
        }

        Set<String> bankSet = new HashSet<>();

        for (String s : bank) {
            bankSet.add(s);
        }
        char[] charSet = new char[]{'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        Integer level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                String cur = queue.poll();
                if(cur.equals(end)){
                    return level;
                }
                char[] charArray = cur.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    char old = charArray[i];
                    for (char c : charSet) {
                        charArray[i] = c;
                        String newString = new String(charArray);
                        if(!visited.contains(newString) && bankSet.contains(newString)){
                            queue.offer(newString);
                            visited.add(newString);
                        }
                        charArray[i] = old;
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
