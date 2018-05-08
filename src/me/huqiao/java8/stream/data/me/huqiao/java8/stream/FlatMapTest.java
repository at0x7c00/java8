package me.huqiao.java8.stream.data.me.huqiao.java8.stream;

import me.huqiao.java8.stream.data.Data;
import me.huqiao.java8.stream.data.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMapTest {


    public static void  main(String[] args){
        List<String> words = Arrays.asList("Hello","World");

        List<String> strings = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        System.out.println(strings);

    }



}
