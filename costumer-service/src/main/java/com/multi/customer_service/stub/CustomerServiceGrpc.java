package com.multi.customer_service.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: CustomerService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
      com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse> getGetAllCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCustomers",
      requestType = com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest.class,
      responseType = com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
      com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse> getGetAllCustomersMethod() {
    io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest, com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse> getGetAllCustomersMethod;
    if ((getGetAllCustomersMethod = CustomerServiceGrpc.getGetAllCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetAllCustomersMethod = CustomerServiceGrpc.getGetAllCustomersMethod) == null) {
          CustomerServiceGrpc.getGetAllCustomersMethod = getGetAllCustomersMethod =
              io.grpc.MethodDescriptor.<com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest, com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getAllCustomers"))
              .build();
        }
      }
    }
    return getGetAllCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
      com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getGetCustomerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomerById",
      requestType = com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest.class,
      responseType = com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
      com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getGetCustomerByIdMethod() {
    io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest, com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getGetCustomerByIdMethod;
    if ((getGetCustomerByIdMethod = CustomerServiceGrpc.getGetCustomerByIdMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerByIdMethod = CustomerServiceGrpc.getGetCustomerByIdMethod) == null) {
          CustomerServiceGrpc.getGetCustomerByIdMethod = getGetCustomerByIdMethod =
              io.grpc.MethodDescriptor.<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest, com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCustomerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getCustomerById"))
              .build();
        }
      }
    }
    return getGetCustomerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest,
      com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse> getSaveCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCustomer",
      requestType = com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest.class,
      responseType = com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest,
      com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse> getSaveCustomerMethod() {
    io.grpc.MethodDescriptor<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest, com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse> getSaveCustomerMethod;
    if ((getSaveCustomerMethod = CustomerServiceGrpc.getSaveCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSaveCustomerMethod = CustomerServiceGrpc.getSaveCustomerMethod) == null) {
          CustomerServiceGrpc.getSaveCustomerMethod = getSaveCustomerMethod =
              io.grpc.MethodDescriptor.<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest, com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("saveCustomer"))
              .build();
        }
      }
    }
    return getSaveCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceStub>() {
        @java.lang.Override
        public CustomerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceStub(channel, callOptions);
        }
      };
    return CustomerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceBlockingStub>() {
        @java.lang.Override
        public CustomerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerServiceFutureStub>() {
        @java.lang.Override
        public CustomerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllCustomers(com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCustomersMethod(), responseObserver);
    }

    /**
     */
    default void getCustomerById(com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCustomerByIdMethod(), responseObserver);
    }

    /**
     */
    default void saveCustomer(com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest request,
        io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCustomerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CustomerService.
   */
  public static abstract class CustomerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CustomerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CustomerService.
   */
  public static final class CustomerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CustomerServiceStub> {
    private CustomerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCustomers(com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerById(com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCustomer(com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest request,
        io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CustomerService.
   */
  public static final class CustomerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse getAllCustomers(com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse getCustomerById(com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCustomerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse saveCustomer(com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CustomerService.
   */
  public static final class CustomerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse> getAllCustomers(
        com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse> getCustomerById(
        com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse> saveCustomer(
        com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CUSTOMERS = 0;
  private static final int METHODID_GET_CUSTOMER_BY_ID = 1;
  private static final int METHODID_SAVE_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CUSTOMERS:
          serviceImpl.getAllCustomers((com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest) request,
              (io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_ID:
          serviceImpl.getCustomerById((com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CUSTOMER:
          serviceImpl.saveCustomer((com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAllCustomersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.multi.customer_service.stub.CustomerServiceOuterClass.GetAllCustomersRequest,
              com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerResponse>(
                service, METHODID_GET_ALL_CUSTOMERS)))
        .addMethod(
          getGetCustomerByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdRequest,
              com.multi.customer_service.stub.CustomerServiceOuterClass.GetCustomerByIdResponse>(
                service, METHODID_GET_CUSTOMER_BY_ID)))
        .addMethod(
          getSaveCustomerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerRequest,
              com.multi.customer_service.stub.CustomerServiceOuterClass.SaveCustomerResponse>(
                service, METHODID_SAVE_CUSTOMER)))
        .build();
  }

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.multi.customer_service.stub.CustomerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CustomerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getGetAllCustomersMethod())
              .addMethod(getGetCustomerByIdMethod())
              .addMethod(getSaveCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
