package hometask.stream;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {

        Stream<String> figuresStream = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        List<Integer> figures = figuresStream.map(var -> var.split("").length).filter(var -> var > 4).toList();
        figures.forEach(System.out::println);
    }
}
