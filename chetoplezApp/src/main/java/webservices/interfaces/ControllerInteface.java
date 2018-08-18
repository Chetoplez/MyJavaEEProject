package webservices.interfaces;

import org.springframework.stereotype.Service;
import webservices.model.HelloRequest;
import webservices.model.HelloResponse;

@Service
public interface ControllerInteface {
    public HelloResponse helloWorld(HelloRequest request);
}
