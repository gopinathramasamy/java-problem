class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean vowel = false;
        boolean consonant = false;

        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                continue;
            } else if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowel = true;
                } else {
                    consonant = true;
                }
            } else {
                return false;
            }
        }

        return vowel && consonant;
    }
}