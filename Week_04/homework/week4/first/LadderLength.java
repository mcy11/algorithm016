package homework.week4.first;

import java.util.*;

/**
 * @author yd
 * @version 1.0
 * @date 2020-10-09 14:54
 */
public class LadderLength {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> bankSet = new HashSet<>(wordList);
        if(!bankSet.contains(endWord)){
            return 0;
        }

        bankSet.remove(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;

        while (!queue.isEmpty()){
            int curLength = queue.size();
            for (int i = 0; i < curLength; i++) {
                String word = queue.poll();
                char[] charArray = word.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    char old = charArray[j];
                    for (char k = 'a'; k <= 'z'; k++){
                        if(k == old){
                            continue;
                        }
                        charArray[j] = k;
                        String newString = new String(charArray);
                        if(bankSet.contains(newString)){
                            if(newString.equals(endWord)){
                                return step + 1;
                            }
                            if(!visited.contains(newString)){
                                queue.offer(newString);
                                visited.add(newString);
                            }
                        }
                    }
                    charArray[j] = old;
                }
            }
            step++;
        }
        return 0;
    }
}
