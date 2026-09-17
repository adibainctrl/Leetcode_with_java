class Solution {
    public boolean isPalindrome(int x) {
        int a;
        
        int revNum=0;
        
        
        if(x<0){
            return false;
    }
    a=x;
    while(a>0){
        int d=a%10;
        revNum=revNum*10+d;
        a=a/10;
    }
    if(revNum==x){
        return true;
    }
    else{
        return false;
    }
}
}
