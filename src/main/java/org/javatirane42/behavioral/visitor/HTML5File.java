package org.javatirane42.behavioral.visitor;

public class HTML5File implements HTMLFile {

    private String head;
    private String body;
    private Visitor visitor;

    public HTML5File(String head, String body, Visitor visitor) {
        this.head = head;
        this.body = body;
        this.visitor = visitor;
    }

    @Override
    public String getDoctypeDeclaration() {
        return "<!DOCTYPE html>";
    }

    @Override
    public String getHead() {
        return head;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.validateFile(this);
    }
}
