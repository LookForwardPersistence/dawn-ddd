package com.dawn.infra;

import java.io.Serializable;

/**
 * Created by Dawn on 2020-04-05.
 */
public class InvokeResult<T> implements Serializable {
    private static final long serialVersionUID = 5628275462439684306L;

    /**
     * 返回结果
     * */
    public T data;

    /**
     * 异常消息
     * */
    private String errorMessage;

    /**
     * 是否成功
     * true 成功，false 失败
     * */
    private boolean success;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * 没有放回结果的成功执行
     * */
    public static InvokeResult success(){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setSuccess(true);
        invokeResult.setErrorMessage("");
        return invokeResult;
    }

    /**
     * 有放回结果的成功执行
     * */
    public static <T> InvokeResult<T> success(T data){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.success = true;
        invokeResult.data = data;
        return invokeResult;
    }

    /**
     * 执行失败
     * */
    public static InvokeResult failure(String msg){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.success=false;
        invokeResult.errorMessage =msg;
        return invokeResult;
    }

    public static <T> InvokeResult<T> failure(T data){
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.success = false;
        invokeResult.data = data;
        return invokeResult;
    }
}