import java.util.Scanner;

interface b {
  void m();
}

// /* This is a // // comment */

//
//public class Main extends a implements b {
//  public static void main(String[] args) {
//    (new Main()).m();
//  }
//}
public class Main {
  public static void main(String[] args) {
    typeCounter("string 2 3.54");
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    String[] split = n.split("\\s+");
    System.out.println(split.length);
    try {
      int count = 0;
      Integer[] integers = new Integer[split.length];
      for (String s :
          split) {
        int i = Integer.parseInt(s);
        integers[count] = i;
        count++;
      }
      Integer sum = sum(integers);
      System.out.println(sum);
    } catch (NumberFormatException e) {
      String sum = sum(split);
      System.out.println(sum);
    }
  }

  public static Integer sum(Integer[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }
    return total;
  }

  public static String sum(String[] arr) {
    String s = "";
    for (int i = 0; i < arr.length; i++) {
      s = s.concat(arr[i]);
    }
    return s;
  }

  public static void typeCounter(String sentence) {
    int countString = 0;
    int countInteger = 0;
    int countDouble = 0;
    String[] words = sentence.split("\\s+");

// Iterate over each word and check its type
    for (String word : words) {
      try {
        // Try to parse the word as a double
        Double.parseDouble(word);
        if (word.contains(".")) {
          countDouble++;
        } else {
          countInteger++;
        }
      } catch (NumberFormatException e) {
        // If the word is not a number, count it as a string
        countString++;
      }
    }
    System.out.println("string: " + countString);
    System.out.println("integer: " + countInteger);
    System.out.println("double: " + countDouble);
  }
}

class a {
  public void m() {
    System.out.println("");
  }
}


class add {
  int added(int i, int j) {
    return i + j;
  }
}