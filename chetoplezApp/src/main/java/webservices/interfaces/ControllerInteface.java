package webservices.interfaces;

import webservices.model.HelloRequest;
import webservices.model.HelloResponse;

public interface ControllerInteface {
    public HelloResponse helloWorld(HelloRequest request);
}
