import java.io.File;

public class Exam061_2 {

  public static void main(String[] args) {

    File file = new File(".");
    File[] files = file.listFiles();
    for (File f : files) {
      System.out.printf("%s %s\n",
          f.isDirectory() ? "d" : "-",
              f.getName());

    }
  }
}
