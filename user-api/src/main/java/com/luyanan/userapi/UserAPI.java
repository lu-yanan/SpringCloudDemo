package com.luyanan.userapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/User")
public interface UserAPI {

    @GetMapping("/alive")
    public String alive();

    @GetMapping("/getById")
    public String getById(@RequestParam Integer id);
}
