package com.zfj.dao;

import com.zfj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author zfj
 * @create 2019/12/2 22:13
 */
public interface BookMapper {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(@Param("bookID") int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    Books queryBookName(@Param("bookName") String bookName);
}
