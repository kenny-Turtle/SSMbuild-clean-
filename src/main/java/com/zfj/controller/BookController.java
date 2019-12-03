package com.zfj.controller;

import com.zfj.pojo.Books;
import com.zfj.service.BookService;
import com.zfj.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zfj
 * @create 2019/12/2 22:36
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        System.out.println(books);
        return "redirect:/book/allBook";//重定向到我们的@RequestMapping("/allBook")请求（请求复用）
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePager(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "updateBook";
    }

    //修改书籍请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println(books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    //删除书籍请求  restFul风格
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBookName")
    public String queryBookName(String queryBookName,Model model){
        Books books = bookService.queryBookName(queryBookName);


        List<Books> list=new ArrayList<Books>();
        list.add(books);

        if(books==null){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list",list);

        return "allBook";

    }
}
