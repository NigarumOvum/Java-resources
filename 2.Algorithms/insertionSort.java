class insertionSort {
    public static void main(String []args){
        int []arr = {4,2,7,12,9,4,1};

        for (int j = 1; i < arr.length; i++){
            int actual = arr[j]

            int i = j-1

            while (i >= 0 && arr[i] > actual){
                arr[i+1] = arr[i]
                i--;
            }
            arr[i+1] = actual;
        }
    }
    for (int el: arr)
{
    System.out.print(elem + " ");
}}