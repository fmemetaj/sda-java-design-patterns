package org.javatirane42.behavioral.strategy;

public class RemoveSpacesStrategy implements SpacesModificationStrategy {

    @Override
    public String modify(String input) {
        StringBuilder stringBuilder = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
