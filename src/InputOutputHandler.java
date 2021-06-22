import java.io.FileReader;
import java.util.Scanner;

public class InputOutputHandler {
    private Scanner keyboardInput = new Scanner(System.in);
    //private Scanner fileScanner = new Scanner(???);

    public void showMessage(String txt) {
        System.out.println(txt);
    }

    public String getInputString() {
        return this.keyboardInput.nextLine();
    }
    public Integer getInputInt() {
        try{
            return this.keyboardInput.nextInt();
        }
        catch(Exception exc){
            return 0;
        }
    }
    public static void main(String[] args) throws Exception {
      FileReader fr= new FileReader("sample1.txt");
      Scanner scan = new Scanner(fr);    
      int i = 1;
      while (scan.hasNextLine()) {
          System.out.println(i + " : " + scan.nextLine());
          i++;
      }
      fr.close();
    }
    
}
