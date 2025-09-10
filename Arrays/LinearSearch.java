package Arrays;

public class LinearSearch {
   /*  public static int LSearch(int arr[], int num){
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == num){
                
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,8,9,7};
        int num = 8;
        int index = LSearch(arr,num);
        if(index == -1){
            System.out.println("not found");

        }
        else{
            System.out.println("Key is at index : "+ index);
        }
    }
}
*/

public static void LSearch(int arr[], int num){
        
    for(int i = 0; i< arr.length; i++){
        if(arr[i] == num){
           System.out.println("Element found at index : " + i); 
           break;
        }
        /*else{
            System.out.println("Element not found");
        }*/
    }
    return;
}
public static void main(String[] args) {
    int arr[] = {2,3,8,9,7};
    int num = 8;
    LSearch(arr,num);
    
}
}