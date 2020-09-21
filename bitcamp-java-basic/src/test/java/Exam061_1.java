import java.io.File;

public class Exam061_1 {

  public static void main(String[] args) {

    File file = new File(".");
    File[] filenames = file.listFiles();
    for (File filename : filenames) {
      System.out.println(filename);
    }

  }
}
