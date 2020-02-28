package com.joy.missyou.exception.http;

import lombok.Getter;

/**
 * Created by SongLiang on 2020-02-20
 */
@Getter
public class HttpException extends RuntimeException {

    protected Integer code;

    protected Integer httpStatusCode = 500;

}
