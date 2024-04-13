package dailyCodingChallenge.ArraysAndHashings;

public class ProductExceptSelf {

    public static void main(String[] args){
      int[] nums = {1,2,3,4};
      productExceptSelf(nums);// with divisionproductExceptSelf_withoutDivision(nums);

        /*List<Integer> nbrs = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         boolean ans = nbrs.stream().anyMatch(x -> x == 22);
        System.out.println(ans);*/
    }

    private static int[] productExceptSelf_withoutDivision(int[] nums) {
        int [] arr = new int[nums.length];
        int left = 1, right = 1;

        //left to  right
        for(int i =0; i < nums.length;i++){
            arr[i] = left;
            left *= nums[i];
        }
        //
        for(int i =nums.length-1; i >=0 ;i--){
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];

        }

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];

        }


        /*int[] arr = new int[nums.length];
        int prod = 1;
        for(int i =0;i < nums.length;i++){
            if(nums[i] != 0) {
                prod = prod * (Math.abs(nums[i]));
            }
        }
        //System.out.println(prod);
        for(int i =0;i < nums.length;i++){
            if(nums[i] != 0) {
                arr[i] = prod / nums[i];
            }
            else
                arr[i] =prod;

        }

        for (int num : arr) {
            System.out.println(num);
        }*/

        return arr;
    }
}
