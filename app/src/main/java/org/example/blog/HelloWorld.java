package org.example.blog;

import io.javalin.Javalin;

public class HelloWorld {

    public static void main(String[] args) {
        Javalin app = Javalin.create(
                config -> config.plugins.enableDevLogging()
        );
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(7070);
    }
}
