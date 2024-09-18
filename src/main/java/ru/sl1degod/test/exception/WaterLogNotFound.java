package ru.sl1degod.test.exception;

public class WaterLogNotFound extends RuntimeException {
    public WaterLogNotFound(String message) {
        super(message);
    }
}
