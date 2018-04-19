package com.shawn.repository;


import com.weibo.motan.demo.service.model.BookStore;
import com.weibo.motan.demo.service.model.BookStoreWithBooks;

import java.util.List;

/**
 * @author Xiaoyue Xiao
 */
public interface BookStoreRepository {

    BookStore selectBookStoreById(Long id);

    List<BookStore> selectAllBookStores();

    BookStoreWithBooks selectBookStoreWithBooksById(Long id);

}
