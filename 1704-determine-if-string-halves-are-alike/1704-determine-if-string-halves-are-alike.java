class Solution {
    public boolean halvesAreAlike(String s) {

        int size = s.length() / 2;

        String str1 = s.substring(0, size);
        String str2 = s.substring(size);

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count1++;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count2++;
            }
        }

        return count1 == count2;
    }
}