package org.javatirane42.structural.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class SessionTokens {

    private Map<String, UUID> userNameToSessionToken = new HashMap<>();

    public Optional<UUID> getUserToken(final String userName) {
        return Optional.ofNullable(userNameToSessionToken.getOrDefault(userName, null));
    }

    public void createTokenForUser(final String userName) {
        userNameToSessionToken.put(userName, UUID.randomUUID());
    }
}
