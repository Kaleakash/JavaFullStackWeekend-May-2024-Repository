package backend.com.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.com.entity.Orders;
import backend.com.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	public String placerOrder(Orders orders) {
		try {
		orders.setOrderdate(LocalDateTime.now());
		ordersRepository.save(orders);
		return "order placed successfully";
		}catch(Exception e) {
			System.err.println(e);
			return "Order didn't place "+e.getMessage();
		}
	}
}
