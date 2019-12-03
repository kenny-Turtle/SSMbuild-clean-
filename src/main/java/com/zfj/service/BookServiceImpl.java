package com.zfj.service;

import com.zfj.dao.BookMapper;
import com.zfj.pojo.Books;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/12/2 22:16
 */
public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookName(String bookName) {
        return bookMapper.queryBookName(bookName);
    }
}
