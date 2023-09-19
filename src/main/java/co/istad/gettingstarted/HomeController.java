package co.istad.gettingstarted;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    private List<Article> articles;

    public HomeController() {
        articles = new ArrayList<>();
        articles.add(Article.builder()
                .title("Article 1")
                .author("ISTAD")
                .description("Description 1")
                .build());
        articles.add(Article.builder()
                .title("Article 2")
                .author("CHHAYA")
                .description("Description 2")
                .build());
        articles.add(Article.builder()
                .title("Article 3")
                .author("SABAY")
                .description("Description 3")
                .build());
        articles.add(Article.builder()
                .title("Article 1")
                .author("ISTAD")
                .description("Description 1")
                .build());
        articles.add(Article.builder()
                .title("Article 2")
                .author("CHHAYA")
                .description("Description 2")
                .build());
        articles.add(Article.builder()
                .title("Article 3")
                .author("SABAY")
                .description("Description 3")
                .build());
        articles.add(Article.builder()
                .title("Article 1")
                .author("ISTAD")
                .description("Description 1")
                .build());
        articles.add(Article.builder()
                .title("Article 2")
                .author("CHHAYA")
                .description("Description 2")
                .build());
        articles.add(Article.builder()
                .title("Article 3")
                .author("SABAY")
                .description("Description 3")
                .build());
        articles.add(Article.builder()
                .title("Article 1")
                .author("ISTAD")
                .description("Description 1")
                .build());
        articles.add(Article.builder()
                .title("Article 2")
                .author("CHHAYA")
                .description("Description 2")
                .build());
        articles.add(Article.builder()
                .title("Article 3")
                .author("SABAY")
                .description("Description 3")
                .build());
        articles.add(Article.builder()
                .title("Article 1")
                .author("ISTAD")
                .description("Description 1")
                .build());
        articles.add(Article.builder()
                .title("Article 2")
                .author("CHHAYA")
                .description("Description 2")
                .build());
        articles.add(Article.builder()
                .title("Article 3")
                .author("SABAY")
                .description("Description 3")
                .build());
    }

    @GetMapping("/")
    public String viewHome(ModelMap modelMap) {
        modelMap.addAttribute("appName", "ISTAD");
        modelMap.addAttribute("articles", articles);
        return "home";
    }

}
