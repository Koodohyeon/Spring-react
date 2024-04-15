package com.example.reactProject.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController         // rendering 하지 않고, 데이터를 보내는 컨트롤러 (ResponseBody 느낌)
@RequestMapping("/react")
public class ReactController {

    @GetMapping("/data")
    public String data() {
        return "스프링부트에서 보낸 데이터";
    }

    @GetMapping("/json")
    public String json() {
        JSONObject jobj = new JSONObject();
        jobj.put("uid", "james");
        jobj.put("uname", "제임스");
        return  jobj.toString();
    }

    @PostMapping("/form")
    public String form(String uid, String uname) {
        System.out.println("uid="+ uid + ", uname=" + uname);
        return "";
    }

    @PostMapping("/multi")
    public String form(String uid, String uname, MultipartFile file) {
        String msg = "uid=" + uid + ", uname=" + uname + ", fname=" + file.getOriginalFilename();
        System.out.println(msg);
        return msg;
    }
}
