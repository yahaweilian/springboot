package com.ynding.springboot.o.bo;

/**
 * 返回状态码及信息
 */
public interface IResponseCode {
    int getCode();

    String getMessage();
}
