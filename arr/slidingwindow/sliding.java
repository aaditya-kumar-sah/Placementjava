class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        
        // Count number of 1s
        for(char c : s.toCharArray()) {
            if(c == '1') {
                ones++;
            }
        }
        
        int zeros = s.length() - ones;
        
        StringBuilder sb = new StringBuilder();
        
        // Add (ones - 1) times '1'
        for(int i = 0; i < ones - 1; i++) {
            sb.append('1');
        }
        
        // Add all zeros
        for(int i = 0; i < zeros; i++) {
            sb.append('0');
        }
        
        // Add last '1' to make it odd
        sb.append('1');
        
        return sb.toString();
    }
}