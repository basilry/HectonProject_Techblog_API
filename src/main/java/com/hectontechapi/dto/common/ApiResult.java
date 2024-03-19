package com.hectontechapi.dto.common;

import com.hectontechapi.constant.ApiStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ApiResult {
    private int code = ApiStatus.OK.getCode();
    private ApiStatus status = ApiStatus.OK;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;
    private Object data;

    public ApiResult(ApiStatus apiStatus) {
        this.code = apiStatus.getCode();
        this.status = apiStatus;
    }
}
