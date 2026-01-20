class Solution {
    public boolean isPalindrome(int x) {
        int r=x;
        int dig=0;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x>0)
        {
            dig=x%10;
            rev=(rev*10)+dig;
            x=x/10;
        }
        if(r==rev)
        {
            return true;
        }
        return false;
        
    }  
}              