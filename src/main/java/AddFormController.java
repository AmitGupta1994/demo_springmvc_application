import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddFormController {

    @RequestMapping("/addform")
    public String showAddForm(){
        return "add_form";
    }
}
