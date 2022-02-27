package com.example.lab1.Controller;
import com.example.lab1.Entity.UserEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Stack;

@RestController
//@RequestMapping("/users")
public class UserController
{
            @GetMapping("/users")
            public Stack<UserEntity> Update(
                    @RequestParam(value = "side1", required = true) int side1,
                    @RequestParam(value = "side2", required = true) int side2,
                    @RequestParam(value = "side3", required = true) int side3)
            {
                UserEntity a = new UserEntity(side1,side2,side3);
                Stack<UserEntity> xxx =new Stack<UserEntity>();
                xxx.push(a);
               //Stack<UserEnity> xxx = new Stack<UserEnity>(side1,side2,side3);
                return xxx;//ResponseEntity.ok(xxx);;
            }
}
