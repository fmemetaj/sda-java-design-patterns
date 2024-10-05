package org.javatirane42.behavioral.visitor;

public interface HTMLFile {
    String getDoctypeDeclaration();
    String getHead();
    String getBody();
    void accept(Visitor visitor);
}
