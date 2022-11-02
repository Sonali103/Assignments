package String;

public class StringBuffer {
    public static void main(String[] args){
        String str= new String("Java String pool refers to collection of the Strings which are stored in heap memory");

       String str1=str.toLowerCase();
       {
            System.out.println("String in lower case: "+str1);
        }

        String str2 =str.toUpperCase();
        {
            System.out.println("String in upper case: "+str2);
        }

        String s1=str.replace("a","$");
        System.out.println("String in after replacement: "+s1);

        if(str.contains("collection")) {
            System.out.println("String has word collection in it");
        }
        else
        {
            System.out.println("String has word collection not in it");
        }

        if(str.compareTo(str)==0){
            System.out.println("String is Equal");
        }
        else{
            System.out.println("String is Not Equal");
        }
    }
}
