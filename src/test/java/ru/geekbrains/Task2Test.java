package ru.geekbrains;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task2Test {
    private static final Logger logger = Logger.getLogger(Task2.class);
    Task2 task2 = new Task2();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void shouldReturnArrayNumbersAfter4(boolean expected, int [] input) {
        boolean actual = task2.checkArrayHasOnly1Or4(input);
        logger.info("input: " + Arrays.toString(input) + " - " + expected);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(true, new int[]{1, 4, 4, 1}),
                Arguments.arguments(true, new int[]{4, 4, 4, 4}),
                Arguments.arguments(true, new int[]{1, 1, 1, 1}),
                Arguments.arguments(false, new int[]{1, 4, 4, 2}),
                Arguments.arguments(false, new int[]{})
        );
    }
}
