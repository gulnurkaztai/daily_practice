public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int ind = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ind = j;
                    break;
                }
            }
            int greater = -1;
            for (int k = ind + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    greater = nums2[k];
                    break;
                }
            }
            res[i] = greater;
        }
        return res;
    }
}
