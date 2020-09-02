package com.njtechstation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.njtechstation.domain.User;
import com.njtechstation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public void login(HttpServletResponse response, String phone, String userpwd) throws IOException {

        response.addHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, PUT, OPTIONS, POST");

        String pwd = userService.queryPwd(phone);
        boolean flag = false;
        if (pwd != null && pwd == userpwd) {
            flag = true;
        }
        ObjectMapper om  = new ObjectMapper();
        String json = om.writeValueAsString(flag);

        response.setContentType("application/json;character=utf-8");
        PrintWriter pw = response.getWriter();
        System.out.println("@@@@@@@@@@@@@@@@" + json);
        pw.println(json);
        pw.flush();
        pw.close();
    }



    @RequestMapping(value = "/register")
    public void register(HttpServletResponse response, String username, String userpwd, String phone) throws IOException {
        User user = new User();
        user.setUsername(username);
        user.setUserpwd(userpwd);
        user.setPhone(phone);
        int flag = userService.addUser(user);
        ObjectMapper om  = new ObjectMapper();
        String json = om.writeValueAsString(flag);

        response.setContentType("application/json;character=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }
}
