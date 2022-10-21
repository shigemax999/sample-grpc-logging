package logging.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.0)",
    comments = "Source: logging.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoggingServiceGrpc {

  private LoggingServiceGrpc() {}

  public static final String SERVICE_NAME = "logging.proto.LoggingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<logging.proto.Logging.LoggingRequest,
      logging.proto.Logging.LoggingResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = logging.proto.Logging.LoggingRequest.class,
      responseType = logging.proto.Logging.LoggingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<logging.proto.Logging.LoggingRequest,
      logging.proto.Logging.LoggingResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<logging.proto.Logging.LoggingRequest, logging.proto.Logging.LoggingResponse> getWriteMethod;
    if ((getWriteMethod = LoggingServiceGrpc.getWriteMethod) == null) {
      synchronized (LoggingServiceGrpc.class) {
        if ((getWriteMethod = LoggingServiceGrpc.getWriteMethod) == null) {
          LoggingServiceGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<logging.proto.Logging.LoggingRequest, logging.proto.Logging.LoggingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  logging.proto.Logging.LoggingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  logging.proto.Logging.LoggingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoggingServiceMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoggingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggingServiceStub>() {
        @java.lang.Override
        public LoggingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggingServiceStub(channel, callOptions);
        }
      };
    return LoggingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoggingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggingServiceBlockingStub>() {
        @java.lang.Override
        public LoggingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggingServiceBlockingStub(channel, callOptions);
        }
      };
    return LoggingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoggingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggingServiceFutureStub>() {
        @java.lang.Override
        public LoggingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggingServiceFutureStub(channel, callOptions);
        }
      };
    return LoggingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LoggingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void write(logging.proto.Logging.LoggingRequest request,
        io.grpc.stub.StreamObserver<logging.proto.Logging.LoggingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                logging.proto.Logging.LoggingRequest,
                logging.proto.Logging.LoggingResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   */
  public static final class LoggingServiceStub extends io.grpc.stub.AbstractAsyncStub<LoggingServiceStub> {
    private LoggingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggingServiceStub(channel, callOptions);
    }

    /**
     */
    public void write(logging.proto.Logging.LoggingRequest request,
        io.grpc.stub.StreamObserver<logging.proto.Logging.LoggingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoggingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LoggingServiceBlockingStub> {
    private LoggingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public logging.proto.Logging.LoggingResponse write(logging.proto.Logging.LoggingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoggingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LoggingServiceFutureStub> {
    private LoggingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<logging.proto.Logging.LoggingResponse> write(
        logging.proto.Logging.LoggingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoggingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoggingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          serviceImpl.write((logging.proto.Logging.LoggingRequest) request,
              (io.grpc.stub.StreamObserver<logging.proto.Logging.LoggingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LoggingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoggingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return logging.proto.Logging.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoggingService");
    }
  }

  private static final class LoggingServiceFileDescriptorSupplier
      extends LoggingServiceBaseDescriptorSupplier {
    LoggingServiceFileDescriptorSupplier() {}
  }

  private static final class LoggingServiceMethodDescriptorSupplier
      extends LoggingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoggingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LoggingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoggingServiceFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
