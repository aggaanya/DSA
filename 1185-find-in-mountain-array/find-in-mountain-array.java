/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakElementIndex = peakElement(mountainArr);
        
        // Search in the increasing part
        int first = binarySearchInFirstHalf(mountainArr, 0, peakElementIndex, target);
        if (first != -1) return first;
        
        // Search in the decreasing part
        return binarySearchInSecondHalf(mountainArr, peakElementIndex + 1, mountainArr.length() - 1, target);
    }

    // Binary search in ascending part
    public int binarySearchInFirstHalf(MountainArray mountainArr, int start, int end, int target) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int val = mountainArr.get(middle);
            
            if (target < val) {
                end = middle - 1;
            } else if (target > val) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // Binary search in descending part
    public int binarySearchInSecondHalf(MountainArray mountainArr, int start, int end, int target) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            int val = mountainArr.get(middle);
            
            if (target < val) {
                start = middle + 1; // reversed because array is decreasing
            } else if (target > val) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // Find peak element
    public int peakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (mountainArr.get(middle) < mountainArr.get(middle + 1)) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return start;
    }
}
