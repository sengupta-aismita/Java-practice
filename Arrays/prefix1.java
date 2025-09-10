package Arrays;

public class prefix1 {
    int sum = 0;
    int max =  Integer.MIN_VALUE;
    int arr[] = {2,4,6,8,10};
    int prefix[] = new int [arr.length];
    prefix[0]= arr[0];
    for(int i = 1; i<arr.length; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i = 0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            sum = i == 0? prefix[j]: prefix[j] - prefix[i-1]; 
            if(sum>max)
            max = sum;
        }
    } 
}
