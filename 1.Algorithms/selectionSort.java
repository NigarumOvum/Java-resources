class selectionSort {
    public static void main(String []args){
        int []arr = {4,2,7,12,9,4,1};

        for (int i = 0; i <arr.length; i++){
            int minimo = 1
            if (int j = i+1; j<arr.length; j++){
                if(arr[minimo] > arr[j]){
                    minimo = j
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimo];
            arr[minimo] = temp;
        }
    }
    for (int el: arr)
{
    System.out.print(elem + " ");
}}