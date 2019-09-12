package com.github.kettle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author WangTao
 * @CreateTime 2019-09-11 16:23
 */

@RestController
public class LoginController {

    @PostMapping("login")
    public Map<String,String> login(String userName,String password ){
        Map<String,String> map = new HashMap<>(16);
        map.put("token","super_admin");
        return map;
    }

    @GetMapping("get_info")
    public Map<String,String> getInfo(){
        Map<String,String> map = new HashMap<>(16);
        map.put("token","super_admin");
        map.put("user_id","1");
        map.put("name","'super_admin'");
        map.put("access","['super_admin', 'admin']");
        map.put("avator","https://file.iviewui.com/dist/a0e88e83800f138b94d2414621bd9704.png");
        return map;
    }

    @GetMapping("message/count")
    public Integer messageCount(){
        return 3;
    }


}
