package com.vahe.primitiv;

import com.vahe.Employee;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitivStreams {


    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 3, 5, 6);


        IntStream intStream = IntStream.of(1, 2, 4, 5);

        int sum = intStream.sum();

//        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
//        intSummaryStatistics.getAverage();


        List<Employee> employees = List.of(new Employee("vahe", "har", 22),
                new Employee("karen", "martirosyan", 23));

        Stream<Integer> integerStream1 = employees.stream()
                .map(Employee::getAge);

        IntStream intStream1 = employees.stream()
                .mapToInt(Employee::getAge);


    }


}
