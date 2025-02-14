// https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // Edge case: Empty array
        
        String prefix = strs[0]; // Start with the first string as prefix
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if prefix exists at the start
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix
                if (prefix.isEmpty()) return ""; // No common prefix found
            }
        }
        return prefix;
    }
}

