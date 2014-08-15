package com.axtavt.rpmtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired VersionInfo version;
    
    @RequestMapping("/")
    public String home(ModelMap model) {
        model.put("version", version);
        return "index";
    }
}
