package com.yann.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: algo_template_wz
 * @description:
 * @author: Yann
 * @create: 2019-09-13 10:55
 **/
public class _3 {
    public static class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            int result = 0;
            Map<Character, Integer> map = new HashMap();
            for (int i = 0, j = i; j < s.length(); ) {
                if (!map.containsKey(s.charAt(j)) || (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) == 0)) {
                    // 不是很懂,换一种方法
                    map.put(s.charAt(j), 1);
                    result = Math.max(j - i + 1, result);
                    j++;
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    i++; //此处遗留,变成死循环
                }
            }
            return result;
        }
    }

    public static class Solution2{
        public int lengthOfLongestSubstring(String s){
            int n  = s.length();
            Set<Character> set = new HashSet<>();
            int result = 0;
            int j =0;
            int i = 0;
            while (i < n && j < n){
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    result = Math.max(result,j-i);
                } else {
                    set.remove(s.charAt(i++));
                }
            }
            return result;
        }
    }
    public static class Solution3{
        public int lengthOfLongestSubstring(String s){
            if (s.length() == 0){
                return 0;
            }
            int max = 0;
            Map<Character,Integer> map = new HashMap<>();
            for (int i=0,j = 0; i <s.length() ;i++){
                if(map.containsKey(s.charAt(i))){
                    j=Math.max(j,map.get(s.charAt(i))+1);
                }
                map.put(s.charAt(i),i);
                max = Math.max(max,i+1-j);
            }
            return max;
        }
    }


}
