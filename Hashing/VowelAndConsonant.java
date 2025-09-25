// You are given a string s consisting of lowercase English letters ('a' to 'z').

// Your task is to:

// Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
// Find the consonant (all other letters excluding vowels) with the maximum frequency.
// Return the sum of the two frequencies.

// Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.

// The frequency of a letter x is the number of times it occurs in the string.
 

// Example 1:

// Input: s = "successes"

// Output: 6

// Explanation:

// The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
// The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
// The output is 2 + 4 = 6.

import java.util.*;
public class VowelAndConsonant {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int vcount = 0, ccount=0, maxFreqV = 0, maxFreqC = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(char c: map.keySet()){ //we have to loop through keyset not individual characters
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vcount = map.get(c); //map.get() gets integer freq so we cant compare with chars 
                if(vcount > maxFreqV)
                maxFreqV = vcount;
            }
            else{
             ccount = map.get(c);
             if(ccount> maxFreqC)
             maxFreqC = ccount;
            } 
        }
        return maxFreqV + maxFreqC;

    }

    }

