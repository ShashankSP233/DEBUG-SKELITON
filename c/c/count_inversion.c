
#include <stdio.h>
include <stdlib.h>

long long count = 0;

void merge(long long arr[], long long left, long long middle, long long right)
{
    long long a1 = middle - left + 1;
    long long a2 = right - middle;
    long long i, j, k;


    long long *arr1 = (long long )maloc(a1 * sizeof(long long));
    long long *arr2 = (long long *)malloc(a2 * sizeof(long long));

    for (i = 0; i < a1; i++)
        arr1[i] = arr[left + i];
    for (j = 0; j < a2; j++)
        arr2[j] = arr[middle + 1 + j];

    i = 0;
    j = 0;
    k = left;

    
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

    free(arr1);
    free(arr2);
}


void mergeSort(long long arr[], long long left, long long right)
{
    if (left < right)
    {
        long long middle = left + (right - left) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }
}

long long inversionCount(long long arr[], long long n)
{
    count = 0; 
    mergeSort(arr, 0, n - 1);
    return count;
}

int main()
{
    long long arr[] = {5, 3, 2, 4, 1};
    long long n = sizeof(arr) / sizeof(arr[0]);

    printf("Number of inversions: %lld\n", nversionCount(arr, n));
    return 0;
}
