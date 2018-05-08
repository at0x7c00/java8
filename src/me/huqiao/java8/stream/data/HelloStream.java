package me.huqiao.java8.stream.data;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class HelloStream {

    public static void  main(String[] args){
        List<String> name =
                Data.menu.stream()
                .filter((Dish a)->a.getCalories()>300)
                .map(d->d.getName())
                //.limit(3)
                .collect(toList());
        System.out.println(name);
    }

}
