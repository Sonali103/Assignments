package String;

public class StrLength {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = str.length();
        System.out.println("The length of String is " + str.length());
    }

/*
        System.out.println(str.charAt(0)+"|"+str.charAt(length-1));
       str.toUpperCase();{
            System.out.println("The str after Uppercase is "+str);

        if(str.contains("Hola")){
            System.out.println("The str contains hola");
        }  }
        String s2=str.substring(5);
        System.out.println(s2);

        String s3=str.substring(2,11);
        System.out.println(s3);

        String s4=str.replace("o","z");
        System.out.println(s4);
        char[] chArr=str.toCharArray();
        for(char ch=chArr){
            System.out.println(ch+"");
        }
        System.out.println();

        String [] strArr= str.split(" ");
        for(String s:strArr){
            System.out.println(s.trim());}
         //Data During Registration
        String email="hello@example.com";
        String phone="1234567890";
        String pass="password123";
       // Validate data from user
        if(!email.isEmpty()){
            System.out.println("Email is available");
            if(!email.contains("@")&& !email.contains(".")){
                System.out.println("Email is not valid");
            }
            else {
                System.out.println("email is valid");
            }
        }

        else{
            System.out.println("please provide in email");}
            if(!phone.isEmpty()){
                System.out.println("Phone is available");
                if(phone.length()!=10){
                    System.out.println("Phone is not valid");
                }
                else {
                    System.out.println("Phone is valid");
                }
            }
            else{
                System.out.println("Please Provide number");
            }

        String string=new String("como estas ");
        string.concat("amigos");
        System.out.println(""+string);

        java.lang.StringBuffer buffer=new java.lang.StringBuffer("Hello World2Object");
        buffer.append("  como estas ");
        System.out.println(""+buffer.toString());

      //buffer and bulider both are same but buffer is thread safe whereas builder is not

        StringBuilder builder=new StringBuilder("Hello World2Object");
        builder.append("como estas ");
        System.out.println(""+builder.toString());
//run time polymorphism
        CharSequence cs=null;
        cs=new String("buffer");
        cs=new java.lang.StringBuffer("hut be");
        cs=new StringBuilder("hehe");*/
    }
