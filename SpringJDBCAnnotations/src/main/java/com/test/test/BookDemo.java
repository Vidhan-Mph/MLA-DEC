package com.test.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.test.Book;
import com.test.config.DBConfig;
import com.test.dao.BookDao;

public class BookDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);

    BookDao bdao = ctx.getBean( BookDao.class);
    
    Book b1=new Book();
    b1.setB_name("Vidhan_AutoBiography");
    b1.setB_price(400);
    
    bdao.createBook(b1);
    
    List<Book> listBooks=bdao.getAllBooks();
    listBooks.forEach(System.out::println);
    
}
}
