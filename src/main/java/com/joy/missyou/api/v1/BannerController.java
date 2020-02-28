package com.joy.missyou.api.v1;

import com.joy.missyou.core.configuration.ExceptionCodeConfiguration;
import com.joy.missyou.dto.PersonDTO;
import com.joy.missyou.exception.http.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by SongLiang on 2019-12-18
 */
@Controller
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    ExceptionCodeConfiguration configuration;

    @RequestMapping({"/test/{id}"})
    @ResponseBody
    public PersonDTO test(@PathVariable(name="id") Integer uid,
                       @RequestParam String name,
                       @RequestBody PersonDTO person) {
        System.out.println("进入 /test 服务" + configuration.getMessage(10001));
        System.out.println("uid: " + uid);
        PersonDTO dto = PersonDTO.builder()
                .name("99yue")
                .age(17)
                .build();
        return dto;
//        throw new NotFoundException(10000);
//        return "hello, 三月!";
    }

    @GetMapping("/test2")
//    @ResponseBody
    public String test2() throws Exception {
        throw new Exception("it is wrong");
    }

    @GetMapping("/test3")
//    @ResponseBody
    public String test3() throws Exception {
        throw new Exception("it is wrong");
    }

}
