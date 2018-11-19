package asignment26;

import java.util.Scanner;

public class Asignment26 {

    public static void printwelcome() {
        System.out.println(" password must have atleast 8 characters");
        System.out.println(" password consists only 3 letters and digits");
        System.out.println("password must contain atleast two digits");
        System.out.println(" ");
    }

    public static  boolean passwordIsvalid(String p) {
        boolean valid= true;
        int count = 0;
        int i;
        if(p.length()<8){
            System.out.println(" the password length is below 8 char with letters and digits");
            valid = false;
          }
       for(i=0;i<p.length();i++){
           if(!charIsnumber(p.charAt(i))&& !charIsLetter(p.charAt(i))){
               valid= false;
           }          
       }
       for(i=0;i<p.length();i++){
           if(charIsnumber(p.charAt(i))){
               count++;
           }
       }
       if(count<2){
           valid=false;
           }
       return valid;
       }

  public static boolean charIsLetter(char charToCheck){
      charToCheck = Character.toUpperCase(charToCheck);
      return(charToCheck>= 'A' && charToCheck<='Z');
  }
   public static boolean charIsnumber(char charToCheck){
  
      return(charToCheck>= '0' && charToCheck<='9'); 
   }
   public static String inputpassword(String message) {
        String inputpassword;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(message);
            inputpassword = sc.nextLine();
        } while (!passwordIsvalid(inputpassword));
        return inputpassword;
    }

    public static void main(String[] args) {
          printwelcome();
        String password1;
        String password2;
            do {
            password1 = inputpassword("enter password : ");
            System.out.println(" ");
            password2 = inputpassword("confirm password : ");
            if (!password1.equals(password2)) {
                System.out.println("password mismatch, try again");
            }
       } while (!password1.equals(password2));
        System.out.println("*** password accepted : " +password2  +" *** ");
    }

}


}
