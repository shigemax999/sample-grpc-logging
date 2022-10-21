package logging;

import io.grpc.stub.StreamObserver;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import logging.proto.Logging;
import logging.proto.LoggingServiceGrpc;

public class LoggingService extends LoggingServiceGrpc.LoggingServiceImplBase {

    private final Logger logger;

    LoggingService(final String path) {
        this.logger = Logger.getLogger(LoggingService.class.getName());
        try {
            FileHandler fileHandler = new FileHandler(path);
            fileHandler.setFormatter(new SimpleFormatter());
            this.logger.addHandler(fileHandler);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void write(Logging.LoggingRequest request, StreamObserver<Logging.LoggingResponse> responseObserver) {
        Logging.LoggingResponse loggingResponse = Logging.LoggingResponse.newBuilder().setStatus("OK").build();
        this.logger.info(request.getMessage());
        responseObserver.onNext(loggingResponse);
        responseObserver.onCompleted();
    }
}
