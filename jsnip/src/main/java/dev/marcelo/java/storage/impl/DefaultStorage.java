package dev.marcelo.java.storage.impl;

import dev.marcelo.java.storage.Storage;

public class DefaultStorage implements Storage {
    override String read(String key) {
        return "value";
    }

    override void write(String key, String value) {

    }
}
