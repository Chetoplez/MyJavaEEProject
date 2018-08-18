package webservices.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloRequest extends  RequestObject {
    private String helloMessage = "Hello!";
}
