class Solution {
    public int countWords(String[] words1, String[] words2) {
        int add = 0;

for (int i = 0; i < words2.length; i++) {

    int count1 = 0;
    int count2 = 0;

    // Count in words1
    for (int j = 0; j < words1.length; j++) {
        if (words2[i].equals(words1[j])) {
            count1++;
        }
    }

    // Count in words2
    for (int j = 0; j < words2.length; j++) {
        if (words2[i].equals(words2[j])) {
            count2++;
        }
    }

    if (count1 == 1 && count2 == 1) {
        add++;
    }
}

return add;
    }
}