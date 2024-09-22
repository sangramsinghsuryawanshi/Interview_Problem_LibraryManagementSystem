package com.project.L.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.L.Model.Book;
import com.project.L.Model.Library;
import com.project.L.Repo.BookConn;
import com.project.L.Repo.LibraryConn;

class BookNotAvilableException extends Exception
{
	public BookNotAvilableException(String msg) {
		super(msg);
	}
}

@Controller
public class ControllerOfLibrary 
{
	@Autowired
	private LibraryConn LC;
	
	@Autowired
	private BookConn BC;
	
	@RequestMapping("/")
	public String isLand()
	{
		return "AddBook.jsp";
	}
	@RequestMapping("/addbook")
	public String isAddBook(@ModelAttribute Book B,Model m)
	{
		if(BC!=null)
		{
			BC.save(B);
			m.addAttribute("msg", "Book added successfully...!");
		}
		else
		{
			m.addAttribute("msg", "Book not added successfully...!");
		}
		return "/";
	}
	@RequestMapping("/BD")
	public String isFetch(Model m)
	{
		List<Book> b = BC.findAll();
		m.addAttribute("book", b);
		return "BookFetch.jsp";
	}
	@RequestMapping("/PB")
	public String isLandPur(Model m)
	{
		return "PurchaseBook.jsp";
	}
	@RequestMapping("/prbook")
	public String isPurBook(@ModelAttribute Library L,Model m) 	{
		List<Book> l = BC.findAll();
		for(Book ob:l)
		{
			if(L.getAddBook().equals(ob.getTitle()) && L.getBorrowBook()<ob.getQuantity())
			{
//				Book o1 = BC.findByTitle(L.getAddBook());
//				o1.setQuantity(o1.getQuantity()-L.getBorrowBook());
//				BC.save(o1);
				m.addAttribute("msg","Good");
				LC.save(L);
			}
			else
			{
				try {
					throw new BookNotAvilableException("BookNotAvilableException");
				} catch (Exception e) {
					m.addAttribute("msg",e.getMessage());
				}
			}
		}
		
		return "/PB";
	}
	@RequestMapping("/UBR")
	public String isFetchU(Model m)
	{
		List<Library> b = LC.findAll();
		m.addAttribute("book", b);
		return "PurBookFetch.jsp";
	}
}
