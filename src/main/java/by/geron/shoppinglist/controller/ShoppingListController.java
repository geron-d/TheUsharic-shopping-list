package by.geron.shoppinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingListController {

    @GetMapping
    public String indexPage(Model model) {
        return "index";
    }

}
