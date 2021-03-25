package ru.geekbrains;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1Test {

    private static final Logger logger = Logger.getLogger(Task1.class);
    Task1 task1 = new Task1();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void shouldReturnArrayNumbersAfter4(int[] expected, int [] input) {
        logger.info("input: " + Arrays.toString(input));
        int[] actual = task1.getArrNumbersAfterLast4(input);
        logger.info("actual: " + Arrays.toString(actual));
        Assertions.assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{5, 6, 7, 8, 9}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
                Arguments.arguments(new int[]{9}, new int[]{1, 2, 3, 4, 5, 6, 7, 4, 9}),
                Arguments.arguments(new int[]{}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 4}),
                Arguments.arguments(new int[]{2,3,-4, 5, 6, 7, 8, 9}, new int[]{4, 2, 3, -4, 5, 6, 7, 8, 9})
        );
    }

    @Test
    void shouldThrowRuntimeExceptionIfNo4() {
        Assertions.assertThrows(RuntimeException.class, () -> task1.getArrNumbersAfterLast4(new int[]{2,3,-4, 5, 6, 7, 8, 9}));
    }


}
