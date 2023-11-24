package generics;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
  public  static void main(String[] args) {
    List<Integer> collect = IntStream.range(10, 50).boxed().collect(Collectors.toList());
    upper(collect);
    sum(collect);
    List<Double> collect1 = DoubleStream.of(1.1, 1.2, 1.3).boxed().collect(Collectors.toList());
    upper(collect1);
    sum(collect1);
    List<Number> lower = IntStream.range(10, 50).boxed().collect(Collectors.toList());
    lower(lower);
    sum(lower);

  }

  public static void upper(List<? extends Number> list) {
    System.out.println(list);
  }

  public static void lower(List<? super Number> list) {
    System.out.println(list);
  }

  public static void sum(List<? extends Number> list) {
    double reduce = list.stream().mapToDouble(number -> number.doubleValue()).reduce(0, (number, number2) -> number + number2);
    System.out.println(
        BigDecimal.valueOf(reduce)
    );
  }
}
