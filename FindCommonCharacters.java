// LeetCode : 1002. Find Common Characters

// Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.


// Example 1:

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: words = ["cool","lock","cook"]
// Output: ["c","o"]
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists of lowercase English letters.


import java.util.*;
public class FindCommonCharacters {
  public List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);
        for(String word:words){
            int[] freq = new int[26];
            for(char c:word.toCharArray()){
                freq[c-'a']++;
            }
            for(int i=0;i<26;i++){
                minfreq[i] = Math.min(minfreq[i],freq[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<minfreq[i];j++){
                list.add(String.valueOf((char)(i+'a')));
            }
        }
        return list;
    }
}
