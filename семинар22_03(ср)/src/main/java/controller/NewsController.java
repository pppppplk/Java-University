package controller;


import models.NewsModel;
import org.springframework.web.bind.annotation.*;
import repo.NewsRepo;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/new")
public class NewsController {

    private final NewsRepo newsRepo;

    public NewsController(NewsRepo newsRepo) {
        this.newsRepo = newsRepo;

    }

    @PostMapping("/news")
    NewsModel createNews (@RequestParam String firstname,@RequestParam String lastname,
                          @RequestParam String heading , @RequestParam String datestart,
                          @RequestParam String dateupdate,  @RequestParam String text,  @RequestParam String name) {


        NewsModel newsModel = new NewsModel( firstname, lastname, heading,
                datestart,dateupdate, text, name);

        return this.newsRepo.save(newsModel);

    }

    @GetMapping("/news/{id}")
    Optional<NewsModel> getNewsModel (@PathVariable Long id) {
        return this.newsRepo.findById(id);
    }

    @DeleteMapping("/news")
    NewsModel deleteNewsModel (@RequestParam String name) {
        List<NewsModel> foundNews = this.newsRepo.findNewsModelsByName(name);
        NewsModel foundNew =  foundNews.get(foundNews.size()-1);
        this.newsRepo.delete(foundNew);
        return  foundNew;
   }




}
