package com.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.basetest.SpringTestCase;
import com.redis.service.RedisTestService;

 

public class RedisTestServiceTest extends SpringTestCase{
	 @Autowired  
	    private RedisTestService redisTestService;

	    @Test  
	    public void getTimestampTest() throws InterruptedException{  
	    	try{
	        System.out.println("第一次调用：" + redisTestService.getTimestamp("param"));
	        Thread.sleep(2000);
	        System.out.println("2秒之后调用：" + redisTestService.getTimestamp("param"));
	        Thread.sleep(11000);
	        System.out.println("再过11秒之后调用：" + redisTestService.getTimestamp("param"));
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    } 
}
