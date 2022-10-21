package logging;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * サーバを立ち上げる。
 */
public class ServerMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        final String path = "d:\\server.log";
        final int port = 8080;
        Server server = ServerBuilder.forPort(port)
                .addService(new LoggingService(path))
                .build();

        server.start();
        System.out.println("start server on port:" + port);
        server.awaitTermination();
    }
}
