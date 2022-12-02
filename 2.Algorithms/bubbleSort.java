class insertionSort {
    public static void main(String []args){
        int []arr = {5,3,4,8,7,5,1,2,3};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1]
                    arr[j+1] = temp;
                }
        }
    }
    for (int el: arr)
{
    System.out.print(elem + " ");
}}