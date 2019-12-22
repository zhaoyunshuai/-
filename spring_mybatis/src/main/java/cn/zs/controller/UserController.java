package cn.zs.controller;

import cn.zs.bo.User;
import cn.zs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("user")
public class UserController {
@Autowired
    UserService userService;
    @RequestMapping("users")
    public String users(Model model) {
        List<User> users = userService.queryAllUser();
        model.addAttribute("users" ,users);
        return "users";
    }


}
