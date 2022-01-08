package my.Learning;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Feature Flags
        boolean filterFlag = false;
        boolean sortFlag = false;
        boolean allMatchFlag = false;
        boolean anyMatchFlag = false;
        boolean noneMatchFlag = false;
        boolean maxFlag = false;
        boolean minFlag = false;
        boolean groupFlag = false;
        boolean extraExampleFlag = true;


        List<Person> people = getPeople();

        // Filter
        if(filterFlag){
            System.out.println(
                    people.stream().filter(
                            temp -> temp.getGender().equals(Gender.FEMALE)
                    ).collect(Collectors.toList())
            );


            List<Person> men = people.stream().filter(
                    temp -> temp.getGender().equals(Gender.MALE)
            ).collect(Collectors.toList());

            System.out.println(men);
        }

        // Sort
        if(sortFlag){
            System.out.println(
                    people.stream().sorted(
                            Comparator.comparing(Person::getAge)
                    ).collect(Collectors.toList())
            );
        }

        // All match
        if(allMatchFlag){
            System.out.println(
                    people.stream().allMatch(temp -> temp.getAge() > 10)
            );
        }

        // Any match
        if(anyMatchFlag){
            System.out.println(
                    people.stream().anyMatch(temp -> temp.getAge() > 10)
            );
        }

        // None match
        if(noneMatchFlag){
            System.out.println(
                    people.stream().noneMatch(temp -> temp.getAge() > 200)
            );
        }

        // Max
        if(maxFlag){
            Optional<Person> older = people.stream().max(Comparator.comparing(Person::getAge));
            System.out.println(older);
        }

        // Min
        if(minFlag){
            var younger = people.stream().min(Comparator.comparing(Person::getAge));
            System.out.println(younger);
        }

        // Group
        if(groupFlag) {
            Map<Gender, List<Person>> groups = people.stream().collect(Collectors.groupingBy(Person::getGender));
            System.out.println(groups);
        }

        // EXTRA EXAMPLE
        if(extraExampleFlag){
            Optional<String> oldestFemale = people.stream()
                    .filter(temp -> temp.getGender().equals(Gender.FEMALE))
                    .max(Comparator.comparing(Person::getAge))
                    .map(Person::getName);
            oldestFemale.ifPresent(System.out::println);
        }
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
