package com.joy.missyou.exception.http;

/**
 * Created by SongLiang on 2020-02-20
 */
public class ForbiddenException extends HttpException {

    public ForbiddenException(int code) {
        this.code = code;
        this.httpStatusCode = 403;
    }

}
