package TwoPointers;

public class PartitionArrayAccordingtoGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0;

        for (int num : nums) {
            if (num < pivot)
                result[left++] = num;
        }

        for (int num : nums) {
            if (num == pivot)
                result[left++] = num;
        }

        for (int num : nums) {
            if (num > pivot)
                result[left++] = num;
        }

        return result;
    }
}
