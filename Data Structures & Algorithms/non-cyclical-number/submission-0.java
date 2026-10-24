class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();

        while(!visit.contains(n)){
            visit.add(n);
            n = sumOfSquares(n);
            if(n == 1){return true;}
        }
        return false;
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
