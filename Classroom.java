package Wilder;

public class Classroom {
    
    public static void main(String[] args) {
    
        Wilder firstWilder = new Wilder("Toto", false);
        System.out.println(firstWilder.whoAmI());

        Wilder secondWilder = new Wilder("Tata", true);
        System.out.println(secondWilder.whoAmI());

         
    }
}
