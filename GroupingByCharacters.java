import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

import lombok.AllArgsConstructor;
import lombok.Data;

public class GroupingByCharacters {

    @Data
    @AllArgsConstructor
    static class Character {
        String name;
        String sureName;
        Integer beerQuantity;
    }

    public static void main(String... doYouBest) {
        List<Character> characterList = List.of(
                new Character("Home", "Simpson", 10),
                new Character("Bart", "Simpson", 1), 
                new Character("Ned", "Flanders", 0),
                new Character("Tod", "Flanders", -1));

        Map<String, List<String>> familyMap = characterList.stream()
                    .collect(groupingBy(Character::getSureName, 
                    mapping(Character::getName, toList())));

        Map<String, Integer> beerQuantityMap = characterList.stream()
                    .collect(groupingBy(Character::getSureName,
                    summingInt(Character::getBeerQuantity)));

        System.out.println(familyMap);
        System.out.println(beerQuantityMap);
    }
    
}