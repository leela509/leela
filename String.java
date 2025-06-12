public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int i = 0, max = 0;
    for (int j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        map.put(c, map.getOrDefault(c, 0) + 1);
        
        // If duplicate detected, shrink from left
        while (map.get(c) > 1) {
            char leftChar = s.charAt(i);
            map.put(leftChar, map.get(leftChar) - 1);
            if (map.get(leftChar) == 0) {
                map.remove(leftChar);
            }
            i++;
        }
        
        max = Math.max(max, j - i + 1);
    }
    return max;
}