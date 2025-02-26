package org.javatirane42.behavioral.chainofresponsibility;

public interface AuthenticationHandler {
    boolean authenticate(Credentials credentials);
    boolean supports(Class<?> clazz);
}
