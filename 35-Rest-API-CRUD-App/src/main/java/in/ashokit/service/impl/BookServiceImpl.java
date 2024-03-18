package in.ashokit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;
import in.ashokit.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	private BookRepository repository;
	
	// (if we write the constructor injection thats why no need Autowired annotation)
	
	public BookServiceImpl(BookRepository repository ) {
	this.repository = repository;
	}
	
	
	
	@Override
	public String upsertBook(Book book) 
{
	
	 Integer bookId = book.getBookId();	
	 
	 System.out.println(book);
	 
		
	 Book save = repository.save(book);
	 
	 System.out.println(book);
	 
	 
	 if(book.getBookId()==null)
	 {
		 return "Record Inserted";
	 }
	 else 
	 {
		 return "Record Updated";
	 }	
}

	@Override
	public List<Book> getAllBooks() {	
		
	return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);		
		return "Book Deleted";
	}

}
