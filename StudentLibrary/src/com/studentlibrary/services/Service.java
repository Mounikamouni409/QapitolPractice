package com.studentlibrary.services;

import java.io.IOException;

import com.studentlibrary.model.Book;
import com.studentlibrary.model.Student;

public interface Service {
	
	void addStudent() throws IOException;
    void getAllStudents() throws IOException;
    Student getStudentById() throws IOException;
    void updateStudentDetail() throws IOException;
    void removeStudent() throws IOException;
    void borrowBook() throws IOException;
    void addBook() throws IOException;
    void getAllBooks() throws IOException;
    Book getBookById() throws IOException;
    void updateBookDetail() throws IOException;
    void removeBook() throws IOException;

}
