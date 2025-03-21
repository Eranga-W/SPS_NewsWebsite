package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.News;
import org.example.entity.NewsEntity;
import org.example.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService{
    final NewsRepository repository;

    @Override
    public void addNews(News news) {
        NewsEntity newsEntity = new ObjectMapper().convertValue(news, NewsEntity.class);
        repository.save(newsEntity);
    }

    @Override
    public List<News> getAll() {
        List<News> newsList = new ArrayList<>();
        List<NewsEntity> allEntityList = repository.findAll();
        allEntityList.forEach(entity ->
                newsList.add(new ObjectMapper().convertValue(entity, News.class))
        );
        return newsList;
    }

    @Override
    public void updateNews(News news) {
        if (repository.findById(news.getId()).isPresent()){
            repository.save(new ObjectMapper().convertValue(news,NewsEntity.class));
        }
    }

    @Override
    public void deleteNewsById(Long id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
    }
}
