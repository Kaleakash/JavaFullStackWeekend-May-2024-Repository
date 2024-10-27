package backend.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.com.entity.OrderItem;
import backend.com.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;
	
	public String storeOrderInfo(OrderItem orderItem) {
		try {
		orderItemRepository.save(orderItem);
		return "Order Item Stored"; 
		}catch(Exception e) {
			System.err.println(e);
			return "Order Item details didn'store"+e.getMessage();
		}
	}
}
