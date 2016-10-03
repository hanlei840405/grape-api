package com.fruit.grape.service.api;

/**
 * Created by hanlei6 on 2016/9/30.
 */
public interface GenerateIdRemoteService {
    /**
     * 获取分布式自增ID
     *
     * @param application
     * @param module
     * @return
     */
    String get(String application, String module);
}
