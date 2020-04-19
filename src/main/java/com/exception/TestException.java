package com.exception;

public class TestException extends RuntimeException {
    private String msg="自定义test异常";
    public TestException() {
    }

    public TestException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
