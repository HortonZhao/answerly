package org.buaa.project.common.consts;

/**
 * Redis缓存常量
 */
public class RedisCacheConstants {

    /**
     * 用户注册分布式锁
     */
    public static final String USER_REGISTER_LOCK_KEY = "answerly:user:register:lock:";

    /**
     * 用户注册验证码缓存
     */
    public static final String USER_REGISTER_CODE_KEY = "answerly:user:register:code:";

    /**
     * 用户注册验证码缓存过期时间
     */
    public static final long USER_REGISTER_CODE_EXPIRE = 5L;

    /**
     * 用户登录缓存标识
     */
    public static final String USER_LOGIN_KEY = "answerly:user:login:";

    /**
     * 用户登录缓存过期时间(天)
     */
    public static final long USER_LOGIN_EXPIRE = 30L;

    /**
     * 用户信息缓存标识
     */
    public static final String USER_INFO_KEY = "answerly:user:info:";

    /**
     * 点赞缓存标识
     */
    public static final String PREFIX_ENTITY_LIKE = "answerly:like:%s:%s";

    /**
     * 消息队列 Topic 缓存标识
     */
    public static final String STREAM_TOPIC_KEY = "answerly:redis-stream";

    /**
     * 消息队列 Group 缓存标识
     */
    public static final String STREAM_GROUP_KEY = "answerly:redis-stream:only-group";

}
