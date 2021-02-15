package com.luyanan.userconsumer;

import com.luyanan.userapi.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "user-provider")
public interface ConsumerAPI extends UserAPI {

    @GetMapping("/getMap")
    Map<String,String> getMap(@RequestParam Integer id);

}
