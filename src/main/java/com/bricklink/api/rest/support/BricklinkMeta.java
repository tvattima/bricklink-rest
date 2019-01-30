package com.bricklink.api.rest.support;

public class BricklinkMeta {
    private Integer code; // API result code. (2xx if successful, any other number otherwise)
    private String message; // More granular information about the result
    private String description; // Detailed description about the result

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BricklinkMeta{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
