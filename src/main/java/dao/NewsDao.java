package dao;

import models.Department;
import models.News;

import java.util.List;

public interface NewsDao {

    void add(News news);

    List<News> getNews();
    News findById(int id);
    void deleteById(int id);
    void clearAll();
}
