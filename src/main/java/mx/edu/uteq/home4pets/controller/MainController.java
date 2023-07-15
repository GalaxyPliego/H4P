package mx.edu.uteq.home4pets.controller;


import java.util.List;

import mx.edu.uteq.home4pets.entity.Blog;
import mx.edu.uteq.home4pets.service.BlogServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private final BlogServiceImpl blogService;

    public MainController(BlogServiceImpl blogService){
        this.blogService = blogService;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<Blog> blogs = blogService.findAllByIsPrincipal(true);
        boolean flagRegister = (blogs.size() > 0) ?  true : false;

        model.addAttribute("listBlogs",blogs);
        model.addAttribute("flagRegister",flagRegister);
        return "index";
    }
}

