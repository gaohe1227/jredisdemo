package com.redis.service;
/**
 * 
 * @author 高鹤
 *
 * 2016年7月3日
 *
 * 作用:
 */
public interface RedisTestService {
	public default void say(){
		System.out.println(this.getClass().getSimpleName());
	}
	public String getTimestamp(String param);
}
