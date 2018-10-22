package com.zxelec.springbootstudy.domain;

import java.io.Serializable;

public class ResultDate implements Serializable {
    private static final long serialVersionUID = -4863248235794600051L;

    private Integer code;

    private Object data;

    private String message;

    public ResultDate(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
