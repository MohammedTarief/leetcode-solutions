class Solution {
    public int romanToInt(String s) {
        // Step 1: Map Roman symbols to values
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Step 2: Traverse the string
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            // Step 3: Check next character for subtraction rule
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }
}
