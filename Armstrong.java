public class Armstrong {
    public static void main(String[] args)
    {
        int n = 153;
        int temp = n;
        int p = 0;
        while (n > 0) {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
    }
}
