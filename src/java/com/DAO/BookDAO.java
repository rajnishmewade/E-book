/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.BookDetails;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface BookDAO {
    
   public boolean addBooks(BookDetails b);
   
   public List<BookDetails> getAllBooks();
   
   public BookDetails getBookById(int id);
   
   public boolean updateEditBooks(BookDetails b);
   
   public boolean deleteBooks(int id);
   
   public List<BookDetails> getNewBooks();
   
   public List<BookDetails> getRecentBooks();
   
   public List<BookDetails> getOldBooks();
   
   public List<BookDetails> getAllRecentBooks();
   
   public List<BookDetails> getAllNewBooks();
   
   public List<BookDetails> getAllOldBooks();
   
   public List<BookDetails> getBookByOld(String email, String cate);

   public boolean oldBookDelete(String email, String cate ,int id);
}

