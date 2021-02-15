package com.luyanan.userprovider;

import com.luyanan.userapi.UserAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class UserController implements UserAPI {

    @GetMapping("/alive")
    public String alive(){
        return "xxoo";
    }

    @Override
    public String getById(@RequestParam Integer id) {
        System.out.println("provider_id:" + id);
        return id+"1";
    }

    @GetMapping("/getMap")
    public Map<String,String> getMap(@RequestParam Integer id){
        System.out.println("id:" + id);
        return Collections.singletonMap(id.toString(),"mmd");
    }

    @GetMapping("/getById")
    public String getById2(Integer id) {
        System.out.println("provider_id:" + id);
        return id.toString();
    }
}
