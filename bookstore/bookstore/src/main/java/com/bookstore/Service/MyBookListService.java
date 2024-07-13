package com.bookstore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.Entity.MyBookList;
import com.bookstore.Repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository myBookRepository;
	
	public void saveMyBooks( MyBookList bookList) {
		myBookRepository.save(bookList);
	}
public List<MyBookList>getAllMyBooks(){
	return myBookRepository.findAll();
}
public void deleteById(int id) {
	myBookRepository.deleteById(id);
}
}
