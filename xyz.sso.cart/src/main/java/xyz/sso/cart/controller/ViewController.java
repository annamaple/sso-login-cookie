package xyz.sso.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/view")
public class ViewController {

    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
}
