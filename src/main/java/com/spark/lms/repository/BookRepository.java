package com.spark.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spark.lms.model.Book;
import com.spark.lms.model.Category;

@Repository //update retreival delete
public interface BookRepository extends JpaRepository<Book, Long> {
	public Book findByTag(String tag); //search by tag
	public List<Book> findByCategory(Category category); // find by category
	public List<Book> findByCategoryAndStatus(Category category, Integer status); // find by category
	public Long countByStatus(Integer status); // find by status
}
