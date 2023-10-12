import java.util.Arrays;

public class implaceMerge {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,3,23,3,23};
        mergeSortImplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    static void mergeSortImplace (int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }

        int mid = (s+e) / 2;
        mergeSortImplace(arr, s, mid);
        mergeSortImplace(arr, mid, e);  

        mergeInplace(arr, s, mid, e);

    }

    private static void mergeInplace(int[] arr, int s, int m, int e) {
        
        int[] mix = new int[e - s];

        int i=s;
        int j=m;
        int k=0;    //for new array

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be posible that one of the arrays is not complete;
        // copy the remaing list;
        while(i < m){
            mix[k] = arr [i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l]; 
        }
    }
}
