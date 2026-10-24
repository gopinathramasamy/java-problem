class Solution {
    public String clearDigits(String s) {
        
String str = "";

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);

    if (Character.isLetter(c)) {
        str += c;
    }

    if (Character.isDigit(c)) {
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
    }
}

return str;

    }
}