class Solution {
    public String reformat(String s) {
        String digit = "";
        String letter = "";

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit += ch;
            } else {
                letter += ch;
            }
        }

        if (Math.abs(digit.length() - letter.length()) > 1) {
            return "";
        }

        String ans = "";

        if (digit.length() > letter.length()) {
            for (int i = 0; i < digit.length(); i++) {
                ans += digit.charAt(i);

                if (i < letter.length()) {
                    ans += letter.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < letter.length(); i++) {
                ans += letter.charAt(i);

                if (i < digit.length()) {
                    ans += digit.charAt(i);
                }
            }
        }

        return ans;
    }
}