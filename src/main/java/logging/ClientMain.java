package logging;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import logging.proto.Logging;
import logging.proto.LoggingServiceGrpc;

public class ClientMain {
    public static void main(String[] args) {
        final String server = "localhost";
        final int port = 8080;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(server, port)
                .usePlaintext()
                .build();

        LoggingServiceGrpc.LoggingServiceBlockingStub stub = LoggingServiceGrpc.newBlockingStub(channel);

        Logging.LoggingRequest request = Logging.LoggingRequest.newBuilder()
                .setStatus("INFO")
                .setMessage("hello world.").build();

        Logging.LoggingResponse response = stub.write(request);

        System.out.println("response status: " + response.getStatus());
    }
}
