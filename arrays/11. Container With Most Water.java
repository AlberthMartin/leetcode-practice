class Solution {
    public int maxArea(int[] height) {
        // volumen på en rektangel height * length
        //Two pointers one to the left and one to the right

        int left = 0; //fist elem
        int right = height.length-1; //last elem

        int maxV = 0; //initally 0

        while(left != right){
            int h = Math.min(height[left], height[right]);
            int l = Math.abs(left - right);
            int tempV = h * l;

            //om tempV är större än max
            if(maxV < tempV){
                maxV = tempV;
            }

            if(height[left]>=height[right] && right > left ){
                right --;
            }
            else if(height[left]<height[right] && left < right){
                left++;
            }else{
                return maxV;
            }

        }
        return maxV;


    }
}