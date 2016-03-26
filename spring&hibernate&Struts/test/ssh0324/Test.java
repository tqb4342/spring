package ssh0324;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.po.Book;
import com.service.BookService;

public class Test {
	public static void main(String[] args) {
		 //创建工厂；
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService service  = (BookService) factory.getBean("bookService");
	
		Book book = new Book("从你的全世界路过",20);
		book.setBid(22);
		service.save(book);  
		
	}
}
