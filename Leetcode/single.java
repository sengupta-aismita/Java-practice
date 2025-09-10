package Leetcode;

public class Single {

    static int single(int arr[]){
        
        for(int i = 0; i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j])
                 count++; 
            }
             if(count <2 && count!=0)
                 return arr[i];
        }
       
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.print(single(arr));
    }
}
