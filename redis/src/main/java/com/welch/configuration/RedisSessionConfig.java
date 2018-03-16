package com.welch.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Administrator on 2018-3-16.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
