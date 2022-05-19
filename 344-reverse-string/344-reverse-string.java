class Solution {
    public void reverseString(char[] s) {            
          int left =0, right = s.length-1;
        //use logic of swapping with the index from left and right value
        while(left < right){
            char temp = s[left];
            s[left++]= s[right];
            s[right--]= temp;
        }
        
    }
}