package org.javatirane42.behavioral.chainofresponsibility;

public class BearerToken implements Credentials {

    @Override
    public String getCredentials(String userId) {
        return "1/mZ1edKKACtPAb7zGlwSzvs72PvhAbGmB8K1ZrGxpcNM"; // dummy implementation
    }
}
