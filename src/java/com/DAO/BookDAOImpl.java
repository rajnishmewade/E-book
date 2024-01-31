/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.entity.BookDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class BookDAOImpl implements BookDAO{
    
    private Connection con;

    public BookDAOImpl(Connection con) {
        super();
        this.con = con;
    }
    
    public boolean addBooks(BookDetails b)
    {
        boolean f=false;
        try{
            String sql="insert into bookdetails(bookname,author,price,bookCategory,status,photo,useremail) values(?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, b.getBookName());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getPrice());
            ps.setString(4, b.getBookCategory());
            ps.setString(5, b.getStatus());
            ps.setString(6, b.getPhotoName());
            ps.setString(7, b.getEmail());
            
            int i=ps.executeUpdate();
            
            if(i==1)
            {
                f=true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return f;
    }

    @Override
    public List<BookDetails> getAllBooks() {
        
        List<BookDetails> list=new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql="select * from bookdetails";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                b=new BookDetails();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8));
                
                list.add(b);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;
    }

    @Override
    public BookDetails getBookById(int id) {
        
        BookDetails b=null;
        try{
           String sql="select * from bookdetails where bookId=? "; 
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           
           ResultSet rs=ps.executeQuery();
           while(rs.next())
           {
                b=new BookDetails();
                b.setBookId(rs.getInt(1));
                b.setBookName(rs.getString(2));
                b.setAuthor(rs.getString(3));
                b.setPrice(rs.getString(4));
                b.setBookCategory(rs.getString(5));
                b.setStatus(rs.getString(6));
                b.setPhotoName(rs.getString(7));
                b.setEmail(rs.getString(8)); 
           }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return b;
    }

    @Override
    public boolean updateEditBooks(BookDetails b) {
        boolean f=false;
        try{
            String sql="update bookdetails set bookname=?, author=?, price=?, status=? where bookId=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, b.getBookName());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getPrice());
            ps.setString(4, b.getStatus());
            ps.setInt(5,b.getBookId());
            
            int i=ps.executeUpdate();
            if(i==1)
            {
                f=true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return f;
     }

    @Override
    public boolean deleteBooks(int id) {
        boolean f=false;
        try{
            String sql="delete from bookdetails where bookId=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int i=ps.executeUpdate();
            if(i==1)
            {
                f=true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return f;
    }

    @Override
    public List<BookDetails> getNewBooks() {
        
        List<BookDetails> list =new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql ="select * from bookdetails where bookCategory=? and status=? order by bookId DESC ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "New");
            ps.setString(2,"Active");
            
            ResultSet rs=ps.executeQuery();
            int i=1;
            while(rs.next() && i<=4 )
            {
               b=new BookDetails();
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               
               list.add(b);
               i++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;
    }

    @Override
    public List<BookDetails> getRecentBooks() {
    
        List<BookDetails> list2 =new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql ="select * from bookdetails where  status=? order by bookId DESC ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "Active");
            
            ResultSet rs=ps.executeQuery();
            int i=1;
            while(rs.next() && i<=4 )
            {
               b=new BookDetails();
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               
               list2.add(b);
               i++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list2;
    }

    @Override
    public List<BookDetails> getOldBooks() {
        List<BookDetails> list3 =new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql ="select * from bookdetails where bookCategory=? and status=? order by bookId DESC ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "Old");
            ps.setString(2,"Active");
            
            ResultSet rs=ps.executeQuery();
            int i=1;
            while(rs.next() && i<=4 )
            {
               b=new BookDetails();
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               
               list3.add(b);
               i++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return list3;
    }

    @Override
    public List<BookDetails> getAllRecentBooks() {
        List<BookDetails> list6 =new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql ="select * from bookdetails where  status=? order by bookId DESC ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "Active");
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
               b=new BookDetails();
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               
               list6.add(b);
               
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list6;    
    }

    @Override
    public List<BookDetails> getAllNewBooks() {
        List<BookDetails> list4 =new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql ="select * from bookdetails where bookCategory=? and status=? order by bookId DESC ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "New");
            ps.setString(2,"Active");
            
            ResultSet rs=ps.executeQuery();
         
            while(rs.next())
            {
               b=new BookDetails();
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               
               list4.add(b);
               
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list4;    
    }

    @Override
    public List<BookDetails> getAllOldBooks() {
        List<BookDetails> list5=new ArrayList<BookDetails>();
        BookDetails b=null;
        
        try{
            String sql ="select * from bookdetails where bookCategory=? and status=? order by bookId DESC ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "Old");
            ps.setString(2,"Active");
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
               b=new BookDetails();
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               
               list5.add(b);
               
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return list5;    
    }

    @Override
    public List<BookDetails> getBookByOld(String email, String cate) {
        List<BookDetails> list=new ArrayList<BookDetails>();
        BookDetails b=null;
        try{
            String sql="select * from bookdetails where bookCategory=? and useremail=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, cate);
            ps.setString(2, email);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
               b=new BookDetails(); 
               b.setBookId(rs.getInt(1));
               b.setBookName(rs.getString(2));
               b.setAuthor(rs.getString(3));
               b.setPrice(rs.getString(4));
               b.setBookCategory(rs.getString(5));
               b.setStatus(rs.getString(6));
               b.setPhotoName(rs.getString(7));
               b.setEmail(rs.getString(8)); 
               list.add(b);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return list;
    }

    @Override
    public boolean oldBookDelete(String email, String cate ,int id) {
        boolean f=false;
        try{
           String sql="delete from bookdetails where bookCategory=? and useremail=? and bookId=?" ;
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, cate);
           ps.setString(2, email);
           ps.setInt(3, id);
           
           int i=ps.executeUpdate();
           if(i==1)
           {
               f=true;
           }
        } 
        catch(Exception e)
        {
           e.printStackTrace();
        }
        return f;
       }
}
