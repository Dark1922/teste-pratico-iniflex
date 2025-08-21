package br.com.iniflex.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DataUtil {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private DataUtil() {}

    public static String formatar(LocalDate data) {
        return data.format(FORMATTER);
    }
}
