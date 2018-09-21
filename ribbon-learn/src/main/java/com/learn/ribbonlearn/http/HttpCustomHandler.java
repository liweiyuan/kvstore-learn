package com.learn.ribbonlearn.http;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @Author :lwy
 * @Date : 2018/9/21 14:41
 * @Description : 请求做处理
 */
public class HttpCustomHandler implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes,
                                        ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {

        System.err.println(httpRequest.getURI());
        return clientHttpRequestExecution.execute(httpRequest, bytes);
    }
}
