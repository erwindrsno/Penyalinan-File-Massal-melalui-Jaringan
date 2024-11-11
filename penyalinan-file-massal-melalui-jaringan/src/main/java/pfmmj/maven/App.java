package pfmmj.maven;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);

        logger.info("This is an information message");

        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(8080);
    }
}
