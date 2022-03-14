package com.example.shoppingmall.com.Login.controller;

import com.example.shoppingmall.com.Login.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    MemberService memberService;





}
