package webservices.model;

import lombok.Getter;

@Getter
public class HelloResponse extends ResponseObject {
    private String message = "Hi there!";
}
