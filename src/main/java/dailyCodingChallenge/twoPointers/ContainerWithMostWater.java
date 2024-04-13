package dailyCodingChallenge.twoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int [] heights ={1,8,6,2,5,4,8,3,7};
        findMAxArea(heights);

    }

    private static void findMAxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;

        while(left<right){
            int containerLength = right - left;
            int area = containerLength * Math.min(heights[right],heights[left]);
            maxArea = Math.max(maxArea,area);
            if(left < right){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("Max area : " + maxArea  );
    }
}
