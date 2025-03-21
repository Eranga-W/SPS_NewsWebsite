package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.NewsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news-controller")
@RequiredArgsConstructor
@CrossOrigin
public class NewsController {
    final NewsService service;

}
