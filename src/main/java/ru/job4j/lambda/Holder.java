package ru.job4j.lambda;

/**
 * Группировка по интересам. [#106993]
 */
public class Holder {
    String key, value;

     Holder(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
