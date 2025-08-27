package org.example.common;

import lombok.Data;

/**
 * 通用消息响应类，用于封装API接口返回的数据格式
 * 包含状态码、消息描述和业务数据三个字段
 */
@Data
public class CommMsg {
    private Integer code;
    private String message;
    private Object data;

    /**
     * 创建成功的响应消息
     *
     * @param data 业务数据对象
     * @return 包含成功状态码(200)、成功消息和业务数据的CommMsg实例
     */
    public static CommMsg success(Object data) {
        CommMsg commMsg = new CommMsg();
        commMsg.setCode(200);
        commMsg.setMessage("success");
        commMsg.setData(data);
        return commMsg;
    }

    /**
     * 创建成功的响应消息，不包含业务数据
     *
     * @return 包含成功状态码(200)和成功消息的CommMsg实例
     */
    public static CommMsg success() {
        return success(null);
    }

    /**
     * 创建错误的响应消息
     *
     * @param code    错误状态码
     * @param message 错误消息描述
     * @return 包含错误状态码和错误消息的CommMsg实例
     */
    public static CommMsg error(Integer code, String message) {
        CommMsg commMsg = new CommMsg();
        commMsg.setCode(code);
        commMsg.setMessage(message);
        return commMsg;
    }

    /**
     * 创建错误的响应消息，使用默认错误码500
     *
     * @param message 错误消息描述
     * @return 包含错误状态码(500)和错误消息的CommMsg实例
     */
    public static CommMsg error(String message) {
        return error(500, message);
    }

    /**
     * 创建错误的响应消息，使用默认错误码500和默认错误消息
     *
     * @return 包含错误状态码(500)和默认错误消息的CommMsg实例
     */
    public static CommMsg error() {
        return error(500, "error");
    }
}

