package com.joy.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SongLiang on 2020-02-29
 */
@Controller
public class HomeController {

    private static Map<String, Integer> scores = new HashMap<>();

    static {
        scores.put("21518665", 14040);
        scores.put("311065", 0);
        scores.put("64878665", 7935);
    }

    @RequestMapping("/home/1")
    @ResponseBody
    public String getHomeOne() {
        return "one";
    }

    @RequestMapping("/home/2")
    @ResponseBody
    public String getHomeTwo() {
        return "two";
    }

    @RequestMapping("/home/query/{uid}")
    @ResponseBody
    public Object getHome(@PathVariable String uid) {
        System.out.println("uid: " + uid);
        //

        Map<String, Object> m = new HashMap<>();
        m.put("server_time", 1582980704);
        Map<String, Object> tab = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List opt = new ArrayList<>();
        data.put("tab_content", tab);
        data.put("opt2_list", opt);
        m.put("data", data);
        m.put("success", true);
        m.put("has_more", true);
        m.put("point", scores.get(uid));
        return m;
    }

    @RequestMapping("/point/deduct/{uid}/{score}")
    @ResponseBody
    public Object deduct(@PathVariable String uid, @PathVariable String score) {

        System.out.println("uid: " + uid);
        //

        Map<String, Object> m = new HashMap<>();
        m.put("server_time", 1582980704);
        Map<String, Object> tab = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List opt = new ArrayList<>();
        data.put("tab_content", tab);
        data.put("opt2_list", opt);
        m.put("data", data);
        m.put("success", true);
        m.put("has_more", true);
        scores.put(uid, scores.get(uid) - Integer.valueOf(score));
        m.put("point", scores.get(uid));
        return m;
    }

}
