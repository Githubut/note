package com.crtxr.note.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Mono<String> handleBoundsException(Exception e) {
        e.printStackTrace();
        return Mono.just(e.getMessage());
    }


}
