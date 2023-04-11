//package Wilder;

public class Wilder {
    
    private String firstname;

    private Boolean aware = false;

    public Wilder(String firstname, Boolean aware) {
        this.aware = aware;
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public Boolean isAware() {
        return this.aware;
    }

    public String whoAmI() {
        if (isAware() == false) {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware" ;
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        }
        
    }
}
