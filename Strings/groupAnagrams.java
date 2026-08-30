import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupAnagram(String[] strs) {

        if (strs == null || strs.length == 0) {

            return new ArrayList<>();

        }
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            

            String key = String.valueOf(charArray);
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input:  " + Arrays.toString(words1));
        System.out.println("Output: " + groupAnagram(words1));
        System.out.println();

        // Test Case 2
        String[] words2 = {"act", "god", "cat", "dog", "tac"};
        System.out.println("Input:  " + Arrays.toString(words2));
        System.out.println("Output: " + groupAnagram(words2));
        System.out.println();

        // Test Case 3
        String[] words3 = {"a"};
        System.out.println("Input:  " + Arrays.toString(words3));
        System.out.println("Output: " + groupAnagram(words3));
    }
}