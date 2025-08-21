package br.com.iniflex.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public final class MoedaUtil {
    private static final NumberFormat FORMATTER = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private MoedaUtil() {}

    public static String formatar(BigDecimal valor) {
        return FORMATTER.format(valor);
    }
}
