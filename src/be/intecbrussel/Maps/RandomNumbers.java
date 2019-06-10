package be.intecbrussel.Maps;

import java.util.*;
import java.util.stream.Collectors;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <101 ; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Print even numbers");
        numbers.stream()
                .filter(n->n % 2 == 0)
                .forEach(System.out::println);
        fancylines();

        System.out.println("Print the average");
        OptionalDouble average = numbers
                .stream()
                .mapToDouble(a->a)
                .average();
        System.out.printf("%.2f\n",average.getAsDouble());
        fancylines();
        System.out.println("Print the sum");
        double sum= numbers
                .stream()
                .mapToDouble(a->a)
                .sum();
        System.out.println(sum);
        fancylines();
        System.out.println("Print all numbers over 50");
        numbers.stream()
                .filter(n->n > 50)
                .forEach(System.out::println);
        fancylines();
        System.out.println("The sum of all even numbers");
       Map<Boolean, Integer>
               result = numbers.stream().collect(
                Collectors.partitioningBy(x -> x%2 == 0, Collectors.summingInt(Integer::intValue)));
        System.out.println(result);






        }

        private static void fancylines(){
            System.out.println("--------------------------------------------");
        }




        }




