class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();

        return isPallindromeHelper(str, 0, str.length()-1);
    }

    public boolean isPallindromeHelper(String str, int start, int end){
        if(start > end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;

        return isPallindromeHelper(str, ++start, --end);
    }
}