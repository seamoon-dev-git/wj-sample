package com.wj.pjt.wjsample.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ApiResponse<T> {

    private T result;             //API 응답 결과

    private int resultCode;      //API 응답 결과 코드

    private String resultMsg;   //API 응답 결과 메세지

    @Builder
    public ApiResponse(final T result, final int resultCode, final String resultMsg) {
        this.result = result;
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

}
