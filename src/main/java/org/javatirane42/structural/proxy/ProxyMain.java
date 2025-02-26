package org.javatirane42.structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        TokenValidator tokenValidator = new TokenValidator();
        SessionTokens sessionTokens = new SessionTokens();
        String userName = "user_example";
        String channelName = "design_patterns";
        String message = "I will learn what proxy is!";
        sessionTokens.createTokenForUser(userName);

        MessageSender realMessageSender = new SlackMessageSender();
        MessageSender proxy = new SlackMessageSenderProxy(realMessageSender, sessionTokens, tokenValidator);

        proxy.sendMessage(channelName, userName, message);
    }
}
