学习笔记
###数组部分
####1、零移动问题
```java
public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
```
  零移动的问题是最简单但是也最能体现双指针和多脂针解决问题的一个思路
使用两个指针一个指针要指向第一个零，而另一个指针去遍历。基本大部分数组和链表的题目
都需要借助多个指针来实现。找到最小的解决问题的循环，通过多指针来解决交换等问题。

####2、爬楼梯问题
```java
 public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int f1 = 1, f2 = 2, f3 = 3;
        for (int i = 3; i < n ; i++) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return f3;
    }
```
  爬楼梯的问题是一中思路，就是递推公式，有的时候通项公式不好求，或者扎的具体问题的时候会发现这个问题随着参数的扩大
变得越来越复杂，我觉得递推就是一个很容易能简化问题的办法。

####3、三数之和问题
```java
public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    while (j < k && nums[k] == nums[--k]);
                }else if (sum < 0){
                    while (j < k && nums[j] == nums[++j]);
                }else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[k] == nums[--k]);
                    while (j < k && nums[j] == nums[++j]);
                }
            }
        }
        return res;
    }
```
  三数之和和最大存水量的题目是通过一些特殊的处理，使得指针的移动更加少或者说省去一次循环，所以在做题的时候要注意一些能优化的细节，还有写代码的时候也尽量简洁，在
保证正确的情况下，尽量简化代码但不要影响可读性。
####4、最大存水量
```java
    public int maxArea(int[] height) {

        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;){
            int minHeight = height[i] >= height[j] ? height[j--] : height[i++];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
```
###链表部分  
####1、判断链表是否有环
```java
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode low = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            if(low == fast){
                return true;
            }
            low = low.next;
            fast = fast.next.next;
        }
        return false;
    }
```
  快慢指针的办法确实非常巧妙，虽然可能实用性上差了一些，但是可以作为一种思路来记住，说不定能拍得上用场。
####2、反转链表
```java
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
``` 
 反转链表作为链表的基本操作直接背吧，大部分时候会作为其他链表题的一个步骤
####3、两两交换 
```java
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
```
  典型的递归思想，找到最小的可操作单元，需要注意的就是指向问题，一定要弄清楚，我觉得做链表的题，最好是
画一下图，确认好连接的断开和连接的顺序，确保万无一失。
####4、确认入环点
```java
    public ListNode detectCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
```  
  第一种方法使用hash表是比较好理解的，遍历看是否有重复的节点。第二种方法，使用快慢指针是需要数学证明的。
