package org.example.service;

import org.example.dto.News;

import java.util.List;

public interface NewsService {
    void addNews(News news);

    List<News> getAll();

    void updateNews(News news);
}
