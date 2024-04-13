package com.example.demo;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpStream {

    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"dad","mag","active",12345));
        list.add(new Employee(2,"mom","house","passive",12344));
        list.add(new Employee(3,"shilpa","mag","active",12343));
        list.add(new Employee(4,"shru","house","active",12342));
        list.add(new Employee(5,"me","mag","passive",12341));

        findnthhighestsalary(list,3);

        /**********************************************
         * very important
         * use filter when you have a value to compare -> like i know status is active or intactive from question
         * else if you dont know values use collectors to group and count .since we dont know
         * the dept names from question need to use collectors to group by the field name and not value
         */
        // emp based on dept
        //list.stream().filter(emp->emp.getDept().equals("mag")).forEach(System.out::println);
        Map<String,List<Employee>> emps = list.stream().collect(Collectors.
                groupingBy(Employee::getDept,Collectors.toList()));

        list.stream().filter(emp->emp.getName().startsWith("m")).collect(Collectors.toList());

       /* emps.forEach((k,v) -> {
            System.out.println("dept " + k);
            System.out.println(" " + v);
        });*/

        // employee count with each dept
       /* Map<String,Long> empes = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        empes.entrySet();
        empes.forEach((k,v)->{
            System.out.println("dept : " + k);
            System.out.println(" " + v);
        });*/


        //active and passive employee
        Map<String,List<Employee>> statemp = list.stream()
                .collect(Collectors.groupingBy(Employee::getStatus,Collectors.toList()));

        statemp.entrySet().forEach(stringListEntry -> {
            System.out.println("Status : " + stringListEntry.getKey());
            System.out.println(" " + stringListEntry.getValue());
        });

        System.out.println(" ");
        //employee active status
        Long active  = list.stream().filter(emp->"active".equals(emp.getStatus())).count();
        System.out.println("active emp : " + active);

        System.out.println(" ");
        //print min/max salary form employee
        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> min = list.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("max :" + max );
        System.out.println( " min : "+ min );

        System.out.println(" ");
        //max salary of each dept
        Map<String,Optional<Employee>> deptSal = list.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

        deptSal.entrySet().forEach(k->System.out.println("dept : "+ k.getKey() + "EMP :" + k.getValue() ));


        Double mag = list.stream().filter(employee -> employee.getDept().equalsIgnoreCase("mag"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(mag);

        list.stream().filter(emp->emp.getDept().equalsIgnoreCase("mag"))
                .map(emp->emp.getSalary())
                .mapToDouble(i->i)
                .sum();

    }

    private static void findnthhighestsalary(List<Employee> list ,int n ) {
        Integer integer = list.stream().map(emp -> emp.getSalary())
                .sorted(Collections.reverseOrder()).skip(n-1).findFirst().get();

        System.out.println("SEEMA  " + integer);
    }

}
