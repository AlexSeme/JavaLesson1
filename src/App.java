import java.util.ArrayList;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Person> myPersons = new ArrayList<Person>();
        InputOutputHandler myHandler = new InputOutputHandler();

        myHandler.showMessage("Input person number");
        Integer numberOfPerson = myHandler.getInputInt();
        Person myPerson = new Person();
        for (int i = 0; i < numberOfPerson; i++) {
            myPerson.load(myHandler);
            myPersons.add(myPerson);
        }
        myPerson.newFile(myPersons);
        /*
        for (int i = 0; i < myPersons.size(); i++) {
            System.out.println(myPersons.get(i).getFirstName());
        }
        */
        
        //myPersons.forEach(s -> System.out.println(s.getFirstName()));
        //Vqvesti iz file

    }
}


