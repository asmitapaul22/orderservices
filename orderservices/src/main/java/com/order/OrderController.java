package com.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/order-now/{price}")
	public String orderNow(@PathVariable long price)
	{
		return "Hi user, your order is placed successfully with MRP$ :"+ price;
	}
}
