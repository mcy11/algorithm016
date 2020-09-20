学习笔记

####1、有效异位词
```java
    public boolean isAnagram(String s, String t) {
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
```
####2、有效异位词分组
```java
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
```

####3、前k高频元素
```java
public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });

        for (Map.Entry<Integer, Integer> integerIntegerEntry : countMap.entrySet()) {
            Integer key = integerIntegerEntry.getKey();
            Integer value = integerIntegerEntry.getValue();
            if(heap.size() == k){
                if(heap.peek()[1] < value){
                    heap.poll();
                    heap.add(new int[]{key, value});
                }
            }else {
                heap.add(new int[]{key, value});
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[0];
        }
        return res;
    }
```
####4、丑数

```java
public int nthUglyNumber(int n) {
        Queue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        int count = 0;
        while (! queue.isEmpty()){
            long cut = queue.poll();

            if(++count >= n){
                return (int) cut;
            }
            for(int num : uglyNumber){
                if(! queue.contains(num * cut)){
                    queue.add(num * cut);
                }
            }
        }
        return -1;
    }

```
    同样需要数学证明，任何丑数乘以2、3、5，其结果也是丑数。
###本周总结：
    本周题目不多，而且难度不大，大部分时间都是用来理解数据结构本身。
    树的题目大部分都用递归的形式，我感觉因为树本身就是一个递归定义。
    这周最大的收获是对于算法学习的一个看法，因为本身是业务开发，对于算法的学习之前都是沉迷在各种数据结构的实现上。
所以把大部分精力花在了上面，记过没有精力去研究实战用法。但是这周有个很大的感触就是工业级别的代码都是有固有实现的，作为业务开发，
最应该的就是了解这些结构，了解特性，实战，然后在遇到业务问题的时候能用到java中已经实现的数据结构来解决，从而避免频繁的使用中间件或者使用降低效率的实现，
重在理解和使用上。    