package com.example.springboot.自动配置功能实例;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.lang.ref.PhantomReference;
import java.nio.charset.Charset;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-26 11:14
 */
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private Charset charset = DEFAULT_CHARSET;
    private boolean force = true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
