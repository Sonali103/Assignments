package Java11;

interface SI
{
    int  SimpleInterest(int a,int b,int c) ;
}
public class Java1 {
    public static void main(String[] args)
    {

        SI SimpleInterestlambda= ( var P, var R, var T) ->
        {
            System.out.println((P*R*T)/100);
            return (P*R*T/100);
        };
        SimpleInterestlambda.SimpleInterest(10000,1,1);
    }
}