package org.javatirane42.behavioral.visitor;

public class VisitorMain {

    public static void main(String[] args) {
        final Visitor visitor = new HTMLFileValidator();

        final HTML4File html4File = new HTML4File("<head> " +
                "    <title>Title</title> " +
                "</head>","<body> " +
                "<p>HTML4 FILE</p> " +
                "</body>", visitor);

        final HTML5File html5File = new HTML5File("<head> " +
                "    <meta charset=\"UTF-8\"> " +
                "    <title>Title</title> " +
                "</head>", "<body> " +
                "<p>HTML5 FILE</p> " +
                "</body>",  visitor);

        visitor.validateFile(html4File);
        visitor.validateFile(html5File);
    }
}
