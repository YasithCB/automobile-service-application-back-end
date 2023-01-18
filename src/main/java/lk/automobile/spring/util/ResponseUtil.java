package lk.automobile.spring.util;

/**
 * author  Yasith C Bandara
 * created 1/18/2023 - 8:03 PM
 * project Automobile-Service-WebApp
 */

public class ResponseUtil {
    private String code;
    private String message;
    private Object data;

    public ResponseUtil(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseUtil() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseUtil{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
