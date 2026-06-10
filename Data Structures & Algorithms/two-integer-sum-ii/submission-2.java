class Solution {
    private int binarySearch(int[] arr, int target, int start, int end){
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            System.out.println(mid);
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] op = new int[2];
        for(int i=0;i<numbers.length;i++){
            int x = target - numbers[i];
            if(x == numbers[i] && (i-1 >=0 && numbers[i-1] == x)){
                op[0] = i;
                op[1] = i+1;
                return op;
            }
            else if(x == numbers[i] && (i+1 < numbers.length && numbers[i+1] == x)){
                op[0] = i+1;
                op[1] = i+2;
                return op;
            } else if(x < numbers[i]){
                int res = binarySearch(numbers, x, 0, i-1);
                if(res != -1){
                    op[0] = res+1;
                    op[1] = i+1;
                    return op;
                }
            } else {
                int res = binarySearch(numbers, x, i+1, numbers.length-1);
                if(res != -1)
                {
                    op[0] = i+1;
                    op[1] = res+1;
                    return op;
                }
            }
        }
        return op;
    }
}
