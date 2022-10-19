class Solution {
    public void reverseString(char[] s) {            
          int left =0, right = s.length-1;
        recursive (s, 0 , s.length-1);
    }
    private void recursive (char[] s, int left, int right){
        //use logic of swapping with the index from left and right value
        if (left > right)
            return;
            char temp = s[left];
            s[left]= s[right];
            s[right]= temp;
        recursive(s, left+1, right -1);  
    }
}