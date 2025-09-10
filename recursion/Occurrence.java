//to find out first occurence of a number in an array
public class Occurrence {

    static int first(int arr[], int key, int i){
        if( i == arr.length)
        return -1;
        if(arr[i] == key)
        return i;

        return first(arr,key,i+1);

    }
    static int last(int arr[],int key, int i){
        if(i < 0)
        return -1;
        if(arr[i] == key)
        return i;

        return last(arr,key,i-1);
    }

    static void all(int arr[], int key, int i){
        if(i == arr.length)
        return -1;
        if(arr[i] == key)
        System.out.print(i);

        return all(arr,key,i+1);
    }
    public static void main(String[] args) {
        // code here
        int arr[] = {1,4,7,5,8,7,5,4};
        int key = 5;
        System.out.println(first(arr,key,0));
        System.out.println(last(arr,key,arr.length-1));
        
    }
}