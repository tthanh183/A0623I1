package ss13_search_algorithm;

import java.util.*;

public class longestIncreaseSubsequence {
    public static int findLengthOfLIS(String s) {                       //O(n*logn)
        List<Character> ans = new ArrayList<Character>();
        ans.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) > ans.get(ans.size() - 1)) {
                ans.add(s.charAt(i));
            }else {
                int index = Collections.binarySearch(ans, s.charAt(i));
                if(index < 0) {
                    index = -(index + 1);
                }
                ans.set(index,s.charAt(i));
            }
        }
        return ans.size();
    }

    public static void showLIS(String s) {                              //O(n^2)
        List<Character> ans = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            List<Character> tmp = new ArrayList<>();
            tmp.add(s.charAt(i));
            for(int j = i + 1; j < s.length(); j ++) {
                if(s.charAt(j) > tmp.get(tmp.size()-1)) {
                    tmp.add(s.charAt(j));
                }
            }
            if(ans.size() < tmp.size()) {
                ans.clear();
                ans.addAll(tmp);
            }
            tmp.clear();
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(findLengthOfLIS(str));
        showLIS(str);
    }
}
