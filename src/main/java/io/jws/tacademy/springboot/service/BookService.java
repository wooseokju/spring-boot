package io.jws.tacademy.springboot.service;

import java.util.Optional;

import io.jws.tacademy.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);
	
}
