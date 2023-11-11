public class BinerySearch {
    public static void main(String[] args) {
        int[] nums = {22,33,44,55,77,88};
        int target = 44;

        int result = linearSearch1(nums, target);
        if (result != -1) {
            System.out.println("Found binerysearch:  "+result); 
        }else{
            System.out.println("Not Found By binery search");
        }
       
    }

    public static int linearSearch1(int[] nums, int target){
       int left = 0;
       int right = nums.length-1;
       int step = 0;

      while (left < right) {
        int mid = (left+right)/2;

        if (nums[mid] == target) {
           System.out.println("Number of steps: "+step);
            return mid;
        }
        else if(nums[mid] < target){
            left = mid+left;
        }else{
           right = mid-right;
        }

       }
       
       return -1; 
    }
}
