package dev.marcelo.java.storage;

public interface Storage {
    String read(String key);


    void write(String key, String value);
}
