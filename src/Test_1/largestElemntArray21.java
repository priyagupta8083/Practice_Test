package Test_1;

public class largestElemntArray21 {
    public static void main(String[] args) {
       int arr[]={3,5,4,7,4,7};

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }

        }
        System.out.println("Largest number is: "+max);
    }
}
