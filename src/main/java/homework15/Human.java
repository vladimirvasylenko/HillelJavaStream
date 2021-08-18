package homework15;

import lombok.Data;

@Data
public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Integer nameLength(String name) {
        return name.length();
    }

    public Integer sortByAge(Human human){
        return human.getAge();
    }
}
