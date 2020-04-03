import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView addTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("sum is : "+ sum);

        ModelAndView mav = new ModelAndView("add_result");
        mav.addObject("sum",sum);
        return mav;
    }
}
