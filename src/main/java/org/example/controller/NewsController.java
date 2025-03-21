package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.News;
import org.example.service.NewsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news-controller")
@RequiredArgsConstructor
@CrossOrigin
public class NewsController {
    final NewsService service;

    @PostMapping("/add-news")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNews(@RequestBody News news){
        service.addNews(news);
    }

    @GetMapping("/get-all")
    public List<News> getAll(){
        return service.getAll();
    }

    @PostMapping("/update-employee")
    public void updateNews(@RequestBody News news){
        service.updateNews(news);
    }


}
