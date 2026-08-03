class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int n = height.length;

        int maxArea =0;
        int currArea = 0;

        while(left < right){
            currArea = Math.min(height[left],height[right]) * (right-left);

            if(currArea>maxArea){
                maxArea = currArea;
            }
            if(height[left]<height[right]) left++;
            else if(height[left]>height[right]) right--;
            else left++;
        
        }

        return maxArea;


        /*int n = height.length;
        int currVol= 0;
        int maxVol =0;
        for(int i =0 ; i <= n-1 ; i++){
            for(int j = 0; j<=n-1; j++){
                currVol = Math.min(height[i],height[j])* (j-1);
                
                if(currVol>maxVol){
                    maxVol = currVol;
                }
            }
        }
        return maxVol;
        */
    }
}