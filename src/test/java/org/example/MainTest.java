package org.example;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testReverseText() {
        String text = "Hello, World!";
        String reversedText = StringUtils.reverse(text);

        // Проверяем, что результат обратного текста совпадает с ожидаемым
        String expectedReversedText = "!dlroW ,olleH";
        assertEquals(expectedReversedText, reversedText, "Текст не был правильно развернут");
    }
}