package org.javatirane42.behavioral.chainofresponsibility;

import java.util.UUID;

public class AwsSignature implements Credentials {

    @Override
    public String getCredentials(String userId) {
        return UUID.randomUUID().toString(); // dummy implementation
    }
}
