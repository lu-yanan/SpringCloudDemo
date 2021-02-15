package com.luyanan.userconsumer;

import com.luyanan.userapi.UserAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class MainController{

    @Autowired
    ConsumerAPI consumerAPI;

    @GetMapping("/alive")
    public String alive(){
        return consumerAPI.alive();
    }

    @GetMapping("/getById")
    public String getById(Integer id){
        System.out.println("id:" + id);
        return consumerAPI.getById(id).toString();
    }

    @GetMapping("/getMap")
    public Map<String,String> getMap(Integer id){
        System.out.println(id);
        return consumerAPI.getMap(id);
    }
}
