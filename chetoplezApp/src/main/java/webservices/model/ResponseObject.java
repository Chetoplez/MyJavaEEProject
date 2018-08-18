package webservices.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseObject {
    public static enum EXIT_CODE {
        OK, KO
    }
    private String reason;
    private String addictionalMessage;
    private EXIT_CODE exitCode;
}
