package dev.marcelo.java.storage.impl;

import dev.marcelo.java.storage.Storage;

public class MapStorage implements Storage {
    private Map<String, String> database = new HashMap<>();

    override String read(String key) {
        return database.get(key);
    }

    override void write(String key, String value) {
        database.put(key, value);
    }
}
