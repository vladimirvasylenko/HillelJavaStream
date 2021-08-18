package homework15;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIClass {

    public static void emptyStream() {

        Stream<Object> emptySteam = Stream.empty();
    }

    public static void listToSetInStream() {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        Set<Integer> set = list.stream().skip(2).limit(10).collect(Collectors.toSet());

        System.out.println(set);
    }

    public static void dataToListInStream() {
//        Set<String> set = Stream.of("first", "second", "third", "fourth", "fifth")
//                .collect(Collectors.toSet());

        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        set.add("fourth");
        set.add("fifth");

        List<String> list = set.stream().collect(Collectors.toList());

        System.out.println(list);
    }

    public static void hashMapInStream() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");

        List<Integer> list = hashMap.keySet().stream().collect(Collectors.toList());
        System.out.println(list);
    }

    public static void stringToIntegerInStream() {

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");
        set.add("10");

        int[] array = set.stream().skip(1).limit(8).mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0).distinct().toArray();
    }

    public static void streamWithoutCollections() {

        Optional<String> stream = Stream.of("one", "two", "three", "four", "five", "six")
                .parallel().sorted().filter((e) -> e.length() > 3).findFirst();
        System.out.println(stream);
    }

    public static void referenceMethodsWithStream(){

        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Vova", 26));
        humanList.add(new Human("Andrey", 24));
        humanList.add(new Human("Vlad", 75));
        humanList.add(new Human("Lena", 32));

        List<Integer> list = humanList.stream()
                .map(Human::getName)
                .map(Human::nameLength)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);
    }


}
