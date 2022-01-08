package src;

class Q7_leetCodePro1 {
    public int subtractProductAndSum(int n) {
        
        int rem, sum = 0, pro = 1;
        while(n != 0) {
            rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            n = n / 10;
        }

        return pro-sum;

    }
}
