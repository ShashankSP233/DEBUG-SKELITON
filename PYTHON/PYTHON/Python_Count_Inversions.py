# Given an array of integers. Find the Inversion Count in the array.  
# Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

# Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. 
# If the array is already sorted then the inversion count is 0.
# If an array is sorted in the reverse order then the inversion count is the maximum.


class MergeSort:
    def __init__(self):
        self.count = 0

    def merge(self, arr, left, middle, right):
        arr1 = arr[left:middle]  
        arr2 = arr[middle:right + 1]  

        i = j = 0
        k = left

        while i <= len(arr1) and j < len(arr2):  
            if arr1[i] < arr2[j]:  
                arr[k] = arr1[i]
                i += 1
            else:
                arr[k] = arr2[j]
                j += 1
                self.count += (len(arr1) - i)  
            k += 1

        while i <= len(arr1):  
            arr[k] = arr1[i]
            i += 1
            k += 1

        while j < len(arr2):
            arr[k] = arr2[j]
            j += 1
            k += 1

    def merge_sort(self, arr, left, right):
        if left <= right:  
            middle = left + (right - left) // 2
            self.merge_sort(arr, left, middle)
            self.merge_sort(arr, middle, right)  
            self.merge(arr, left, middle, right)

    def inversion_count(self, arr):
        self.count = 0
        self.merge_sort(arr, 0, len(arr) - 1)
        return self.count


if __name__ == "__main__":
    arr = [5, 3, 2, 4, 1]
    ms = MergeSort()
    print(f"Number of inversions: {ms.inversion_count(arr)}")
