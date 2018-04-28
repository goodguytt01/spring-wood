package com.shawn.repository;


import com.jcgroup.model.BookStore;
import com.jcgroup.model.BookStoreWithBooks;

import java.util.List;

/**
 * @author Xiaoyue Xiao
 */
public interface BookStoreRepository {

    BookStore selectBookStoreById(Long id);

    List<BookStore> selectAllBookStores();

    BookStoreWithBooks selectBookStoreWithBooksById(Long id);

}
