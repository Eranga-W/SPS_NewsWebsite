package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.NewsRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService{
    final NewsRepository repository;
}
