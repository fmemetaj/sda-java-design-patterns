package org.javatirane42.behavioral.chainofresponsibility;

import java.util.Random;

public class UsernameAndPasswordAuthenticationHandler implements AuthenticationHandler {

    @Override
    public boolean authenticate(Credentials credentials) {
        if (supports(credentials.getClass())) {
            return isPasswordValid(credentials);
        }
        return false;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isInstance(UsernameAndPasswordCredentials.class);
    }

    public boolean isPasswordValid(Credentials credentials) {
        return new Random().nextBoolean();
    }
}
