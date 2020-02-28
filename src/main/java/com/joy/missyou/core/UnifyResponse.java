package com.joy.missyou.core;

import lombok.Data;

/**
 * Created by SongLiang on 2020-02-24
 */
@Data
public class UnifyResponse {

    private int code;
    private String message;
    private String request;

    public UnifyResponse(int code, String message, String request) {
        this.code = code;
        this.message = message;
        this.request = request;
    }

}
