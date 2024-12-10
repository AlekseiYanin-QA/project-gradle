package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class MainTest {

    @Test
    public void testMainOutput() throws IOException {
        // Перенаправляем стандартный вывод в тест
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Запускаем метод main
            Main.main(new String[]{});

            // Получаем результат вывода
            String output = outputStream.toString();

            // Проверяем, что вывод содержит определенные строки
            assertTrue(output.contains("Hello and welcome!"));
            for (int i = 1; i <= 5; i++) {
                assertTrue(output.contains("i = " + i));
            }

            // Дополнительная проверка на количество строк в выводе
            String[] lines = output.split(System.lineSeparator());
            assertEquals(6, lines.length, "Ожидаем 6 строк в выводе (приветствие и 5 значений i)");

        } finally {
            // Возвращаем стандартный вывод
            System.setOut(originalOut);
        }
    }
}