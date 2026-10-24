class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast =sumOfSquares(n);

        while(slow!=fast){
            fast = sumOfSquares(fast);
            fast = sumOfSquares(fast);
            slow = sumOfSquares(slow);
        }
        return fast == 1;
    }

    public int sumOfSquares(int n){
        int op = 0;

        while(n>0){
            int digit = n%10;
            digit = digit * digit;
            op +=digit;
            n /=10;
        }
        return op;
    }
}
