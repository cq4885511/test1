package com.tedu.sp04.order.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;
@FeignClient(name = "user-service",fallback = UserFeignServiceFB.class)
public interface UserFeignService {
	@GetMapping("/{userId}")
	JsonResult<User> getUser(Integer userId);
	@GetMapping("/{userId}/score")
	JsonResult assSocre(@PathVariable Integer userId,@RequestParam Integer score);

}
