public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {

        int mps = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            int mp = 1;

            for (int j = i; j < nums.length; j++) {

                mp = mp * nums[j];

                mps = Math.max(mps, mp);
            }
        }

        return mps;
    }

    public static void main(String[] args) {

        int nums[] = {2, 3, -2, 4};

        System.out.println(maxProduct(nums));
    }
}


// Below O(n)
// public class MaxProductSubarray {

//     public static int maxProduct(int[] nums) {

//         int maxProd = nums[0];
//         int minProd = nums[0];
//         int answer = nums[0];

//         for (int i = 1; i < nums.length; i++) {

//             int num = nums[i];

//             if (num < 0) {
//                 int temp = maxProd;
//                 maxProd = minProd;
//                 minProd = temp;
//             }

//             maxProd = Math.max(num, maxProd * num);
//             minProd = Math.min(num, minProd * num);

//             answer = Math.max(answer, maxProd);
//         }

//         return answer;
//     }

//     public static void main(String[] args) {

//         int nums[] = {2, 3, -2, 4};

//         System.out.println(maxProduct(nums));
//     }
// }