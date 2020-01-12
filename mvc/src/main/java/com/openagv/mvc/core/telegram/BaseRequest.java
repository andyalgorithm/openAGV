package com.openagv.mvc.core.telegram;

import cn.hutool.core.util.IdUtil;
import com.openagv.mvc.core.enums.ReqType;
import com.openagv.mvc.core.interfaces.IProtocol;
import com.openagv.mvc.core.interfaces.IRequest;

import java.util.Objects;

/**
 * Created by laotang on 2020/1/12.
 */
public class BaseRequest implements IRequest {

    /**请求ID*/
    protected String id;
    /**协议对象*/
    protected IProtocol protocol;
    /**请求对象类型枚举*/
    protected ReqType reqType;

    public BaseRequest(ReqType reqType, IProtocol protocol) {
        Objects.requireNonNull(reqType, "请求对象枚举值不能为空");
        Objects.requireNonNull(protocol, "协议对象不能为空");
        setId(IdUtil.objectId());
        setProtocol(protocol);
        setReqType(reqType);
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setProtocol(IProtocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public IProtocol getProtocol() {
        return protocol;
    }

    @Override
    public void setReqType(ReqType reqType) {
        this.reqType = reqType;
    }

    @Override
    public ReqType getReqType() {
        return reqType;
    }

    @Override
    public String getRawContent() {
        return null;
    }
}