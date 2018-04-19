package com.weibo.motan.demo.service;


import com.weibo.motan.demo.service.model.BookStore;
import com.weibo.motan.demo.service.model.BookStoreWithBooks;

import java.util.List;
import java.util.Optional;

/**
 * @author Xiaoyue Xiao
 */
public interface BookStoreService {

    Optional<BookStore> getBookStoreById(Long id);

    List<String> getAllBookStoreNames();

    Optional<BookStoreWithBooks> getBookStoreWithBooksById(Long id);

}
