package spring.training.artifacts.db.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import spring.training.artifacts.db.AmazonOrdersRepository;
import spring.training.artifacts.entity.AmazonOrders;
import spring.training.artifacts.entity.Patient;

@Component
public class AmazonOrderImplementation {
	@Autowired
AmazonOrdersRepository amazonrepo;
	
	public void saveAllOrder(List<AmazonOrders> orders)
	{
		amazonrepo.saveAll(orders);
	}
	
	public void fetchAllOrders()
	{
   List<AmazonOrders> orders=	amazonrepo.findAll();
   
   for(AmazonOrders order:orders)
   {
	   System.out.println(order);
   }
	}
	
	
	public void fetchFirstPage()
	{
		 List<AmazonOrders> orders=	amazonrepo.findAll(Pageable.ofSize(3)).getContent();
		   
		   for(AmazonOrders order:orders)
		   {
			   System.out.println(order);
		   }
	}
	
	public void fetchSecondPage()
	{
		 List<AmazonOrders> orders=	amazonrepo.findAll(Pageable.ofSize(3)).getContent();
		   
		   for(AmazonOrders order:orders)
		   {
			   System.out.println(order);
		   }
	}
	
	
	public void getRecordsByPageIdAndNoOfRecords(int pageId, int noOfReorcds) { 
		   
        Pageable pageable = PageRequest.of(pageId, noOfReorcds); 

          List<AmazonOrders> allOrders = amazonrepo.findAll(pageable).getContent(); 
          System.out.println(allOrders); 

}
	
}
