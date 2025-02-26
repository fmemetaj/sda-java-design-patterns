package org.javatirane42.behavioral.chainofresponsibility;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        AuthenticationHandler authenticationHandlerUnP = new UsernameAndPasswordAuthenticationHandler();
        AuthenticationHandler authenticationHandlerBearer = new BearerTokenAuthenticationHandler();
        AuthenticationHandler authenticationHandlerAws = new AwsAuthenticationHandler();

        ChainAuthenticationElement lastElement = new ChainAuthenticationElement(authenticationHandlerAws);
        ChainAuthenticationElement middleElement = new ChainAuthenticationElement(authenticationHandlerBearer, lastElement);
        ChainAuthenticationElement firstElement = new ChainAuthenticationElement(authenticationHandlerUnP, middleElement);

        firstElement.authenticate(new AwsSignature());
        firstElement.authenticate(new UsernameAndPasswordCredentials());
        firstElement.authenticate(new BearerToken());
    }
}
