package ssh0324;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.po.Book;
import com.service.BookService;

public class Test {
	public static void main(String[] args) {
		 //����������
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService service  = (BookService) factory.getBean("bookService");
	
		Book book = new Book("�����ȫ����·��",20);
		book.setBid(22);
		service.save(book);  
		
	}
}
