package cap.controller;

import cap.bean.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(Model model) {
        model.addAttribute("data", "SpringMVC");
        return "test";
    }


    @RequestMapping("/test2")
    public void test2(Model model) {
        model.addAttribute("data", "SpringMVC Test2");
    }

    @RequestMapping("/test3")
    public ModelAndView test3() {
        ModelAndView modelAndView = new ModelAndView("test3");
        //modelAndView.setViewName("welcome");
        modelAndView.addObject("data", "SpringMVC Test3");
        return modelAndView;
    }

    @RequestMapping("/test4")
    public Map test4() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        return map;
    }

    @RequestMapping(value = "sayHi", method = RequestMethod.POST)
    public String hi(HttpServletRequest request, Model model, @RequestParam("name") String username) {
        String nameByRequest = request.getParameter("name");
        model.addAttribute("nameByReuest", nameByRequest);
        model.addAttribute("username", username);
        return "result";

    }

    @RequestMapping(value = "sayHi", method = RequestMethod.GET)
    public String hi() {

        return "sayHi";
    }

        @RequestMapping(value = "hello",method = RequestMethod.GET)
    public void Hello(){

    }
    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public ModelAndView hello(Admin admin){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("admin",admin);
        modelAndView.setViewName("result2");
        return modelAndView;
    }
}
