package sorting;

public class Insertion_sort {

    public static void main(String[] args) {
        insertion();
    }
    public static void insertion(){
        int arr[] ={5,4,3,2,1};
        for (int i = 1; i<arr.length;i++){
            int key= arr[i];
            int  j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j =j+1;

            }
            arr[j+1]=key;
        }
    }
}
