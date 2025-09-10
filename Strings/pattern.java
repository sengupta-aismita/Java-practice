public class pattern {

    public static void patternSearching(String str, String pat){
        int idx = str.indexOf(pat);
        if(idx == -1)
        System.out.println("Not found");
        else
        System.out.println("Found at index : " + idx);

    }

     public static void patternSearching(String str, String pat){
        int idx = str.indexOf(pat);
        while(idx >= 0){
            System.out.println("Found at index : " + idx);
            idx = str.indexOf(pat, idx+1);
        }


    }
    public static void main(String[] args) {
        
    }
}
