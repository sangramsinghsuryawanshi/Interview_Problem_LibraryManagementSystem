package com.project.L.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.L.Model.Book;

public interface BookConn extends JpaRepository<Book, Integer> {
	public Book  findByTitle(String title);
}
