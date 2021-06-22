import java.util.ArrayList;

public class Person {
  private String firstName;
  private Integer id;
  private Integer height;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getHeight() {
    return this.height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public void load(InputOutputHandler myHandler) throws Exception {
    myHandler.showMessage("Insert your name");
    setFirstName(myHandler.getInputString());
    myHandler.showMessage("Insert your id");
    setId(myHandler.getInputInt());
    myHandler.showMessage("Insert your height");
    setHeight(myHandler.getInputInt());
  }

  public static void newFile(ArrayList myPersons) throws Exception {
    /*
    FileWriter nFile = new FileWriter("sample1.txt");
    System.out.println(Arrays.toString(myPersons.get(0)));
    for (int i = 0; i < myPersons.size(); i++) {
      //nFile.write("First Name: " + myPersons.get(i).getFirstName() + " Id: " + myPersons.get(i).getId() + " Height: " + myPersons.get(i).getHeight() + "\n");
    }
    nFile.close();
    */
  }

}