package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AddService;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView addTwoNumbers(int num1, int num2) {

        AddService addService = new AddService();

        int sum = addService.add(num1, num2);

        System.out.println("sum is : " + sum);

        ModelAndView mav = new ModelAndView("add_result");
        mav.addObject("sum", sum);
        return mav;
    }
}
