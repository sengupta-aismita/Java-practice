package Leetcode;

public class frequency {
     public int maxDifference(String s) {
        int diff, odd=0, even=0;
        for(int i = 0; i<s.length(); i++){
            int count=1;
              while(i< s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
              }
              if(count % 2 !=0){
                odd = Math.max(odd,count);
              }
              else{
                even = Math.max(even,count);
              }
        }
        return Math.abs(odd-even);
    }
}
