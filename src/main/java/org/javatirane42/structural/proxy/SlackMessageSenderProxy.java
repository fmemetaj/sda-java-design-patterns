package org.javatirane42.structural.proxy;

import java.util.Optional;
import java.util.UUID;

public class SlackMessageSenderProxy implements MessageSender {

    private MessageSender messageSender;
    private SessionTokens sessionTokens;
    private TokenValidator tokenValidator;

    public SlackMessageSenderProxy(MessageSender messageSender, SessionTokens sessionTokens, TokenValidator tokenValidator) {
        this.messageSender = messageSender;
        this.sessionTokens = sessionTokens;
        this.tokenValidator = tokenValidator;
    }

    @Override
    public void sendMessage(String channelName, String username, String message) {
        final Optional<UUID> userTokenOptional = sessionTokens.getUserToken(username);
        if (userTokenOptional.isPresent()) {
            final UUID existingToken = userTokenOptional.get();
            if (!tokenValidator.isExpired(existingToken)) {
                messageSender.sendMessage(channelName, username, message);
            }
        } else {
            System.out.println("Message from " + username + " not sent to channel " + channelName +
                    " because user has no valid access token");
        }
    }
}
