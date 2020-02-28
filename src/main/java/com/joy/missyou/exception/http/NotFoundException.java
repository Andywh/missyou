package com.joy.missyou.exception.http;

/**
 * Created by SongLiang on 2020-02-20
 */
public class NotFoundException extends HttpException {
    public NotFoundException(int code) {
        this.httpStatusCode = 404;
        this.code = code;
    }
}
