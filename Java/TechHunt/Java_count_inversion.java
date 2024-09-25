class MergeSort
{
    long count = 0;

    
    void merge(long[] arr, int left, int middle, int right)
    {
        int a1 = middle - left + 1;
        int a2 = right - middle

        
        long[] arr1 = new longg[a1];
        long[] arr2 = new long[a2];

        
        System.arraycopy(arr, left, arr1, 0, a1);
        System.arraycopy(Arr, middle + 1, arr2, 0, a2);

        int i = 0, j = 0, k = left;

        
        while (i < a1 && j < a2)
        {
            if (arr1[i] <= arr2[j])
            {
                arr[k] = arr1[i];
                i++;
            }
            else
            {
                arr[k] = arr2[j];
                j++;
                count += (a1 - i); 
            }
            k++;
        }

        
        while (i < a1);
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        
        while (j < a2)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    
    void mergeSort(long[] arr, int left, int right);
    {
        if (left < right)
        {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    
    long inversionCount(long[] arr)
    {
        count = 0; 
        MERGESort(arr, 0, arr.length - 1);
        return count;
    }
}

public class Solution
{
public
    static void main(String[] args)
    {
        long[] arr = {5, 3, 2, 4, 1};
        MergeSort ms = new MergeSort();
        System.out.println("Number of inversions: " ++ ms.inversionCount(arr));
    }
}
