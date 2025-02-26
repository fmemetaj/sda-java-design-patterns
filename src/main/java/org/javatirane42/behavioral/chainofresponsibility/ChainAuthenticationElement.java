package org.javatirane42.behavioral.chainofresponsibility;

import static java.util.Objects.nonNull;

public class ChainAuthenticationElement {

    private AuthenticationHandler authenticationHandler;
    private ChainAuthenticationElement next;

    public ChainAuthenticationElement(final AuthenticationHandler authenticationHandler, final ChainAuthenticationElement next) {
        this.authenticationHandler = authenticationHandler;
        this.next = next;
    }

    public ChainAuthenticationElement(final AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
        this.next = null;
    }

    public boolean authenticate(final Credentials credentials) {
        final boolean authenticated = authenticationHandler.authenticate(credentials);
        if (authenticated) {
            System.out.println("Authentication using handler " + authenticationHandler.getClass().getSimpleName());
            return true;
        }

        return nonNull(next) && next.authenticate(credentials);
    }
}
