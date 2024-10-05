package org.javatirane42.behavioral.chainofresponsibility;

public class UsernameAndPasswordCredentials implements Credentials {

    @Override
    public String getCredentials(String userId) {
        return "user:Password_123";
    }
}
