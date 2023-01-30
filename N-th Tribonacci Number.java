class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1,s=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            for(int i=0;i<n-2;i++){
                s=a+b+c;
                a=b;
                b=c;
                c=s;
            }
            return s;
        }    
    }
}