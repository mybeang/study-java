package mybeang.home01.mybeang_home01_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControl {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam(value = "name", required = false, defaultValue = "mybeang") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam(value = "name", required = false, defaultValue = "mybeang") String name){
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello HelloApi(@RequestParam(value = "name", required = false, defaultValue = "mybeang") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;
                
        public String getName(){
            return this.name;
        };
        public void setName(String name) {
            this.name = name;
        }
    }
}
