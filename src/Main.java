import db.DataBaza;
import model.Groub;
import servize.serviceImpl.GroubServize;

public class Main {
    public static void main(String[] args) {

        Groub groub = new Groub(1,"Java=9","best",1980);
        GroubServize groubServize = new GroubServize();
        System.out.println(groubServize.addNewGroub(groub));
        System.out.println(groubServize.addNewGroub(new Groub(1, "Js", "best",1975)));
        System.out.println(groubServize.getAllGroubs());
        //System.out.println(groubServize.getGroupById());
        

    }
}