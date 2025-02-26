package org.javatirane42.structural.proxy;

import java.util.Random;
import java.util.UUID;

public class TokenValidator {
    boolean isExpired(UUID token) {
        return new Random().nextBoolean();
    }
}
