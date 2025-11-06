package e30Packege.person;

public class Estudiantes{
    public String email;
    public String matricula;
    private int calif;

    boolean setEmail(String email){
        if(!email.contains("@")){
            return false;
        }
        this.email = email;
        return true;
    }
    String getEmail(){
        return this.email;

    }
}