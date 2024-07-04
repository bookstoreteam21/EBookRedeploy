package com.team.bookstore.Repositories;

import com.team.bookstore.Entities.Book;
import com.team.bookstore.Entities.Category;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findBookById(int id);
    List<Book> findAllByIsebook(boolean isEbook);
    List<Book> findAll(Specification<Book> spec);
    List<Book> findBooksByCategoryAndIsebook(Category category,
                                              boolean isebook);
    List<Book> findBooksByDiscountNotAndIsebook(int notlikediscount,
                                                boolean isebook);
}
