package cn.itcast.user.web;

import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        System.out.println("id-"+id);
        return userService.queryById(id);
    }
    @GetMapping("/login")
    public String queryString(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("uuuuuu-"+username);
        System.out.println("pppppp-"+password);
        return userService.queryString(username,password);
    }
}
