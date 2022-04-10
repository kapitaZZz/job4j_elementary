package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects()
                        .stream())
                .mapToInt(Subject::getScore)
                .average().orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(s -> {
                    return new Tuple(s.getName(),
                            s.getSubjects().stream()
                                    .mapToInt(Subject::getScore)
                                    .average()
                                    .orElse(0D));
                })
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(s -> {
                    return new Tuple(s.getName(), s.getSubjects()
                            .stream()
                            .mapToInt(Subject::getScore)
                            .sum());
                })
                .max((i1, i2) -> Double.compare(i1.getScore(), i2.getScore()))
                .orElse(new Tuple("Empty", 0D));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .max((i1, i2) -> Double.compare(i1.getScore(), i2.getScore()))
                .orElse(new Tuple("Empty", 0D));
    }
}
