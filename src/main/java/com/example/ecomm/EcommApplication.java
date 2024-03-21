package com.example.ecomm;

import com.example.ecomm.controllers.InventoryController;
import com.example.ecomm.controllers.OrderController;
import com.example.ecomm.controllers.ProductController;
import com.example.ecomm.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EcommApplication implements CommandLineRunner {
	@Autowired
	InventoryController inventoryController;

	@Autowired
	OrderController orderController;

	@Autowired
	ProductController productController;

	public static void main(String[] args) {
		SpringApplication.run(EcommApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		CreateOrUpdateRequestDto requestDto = new CreateOrUpdateRequestDto();
//		requestDto.setUserId(1);
//		requestDto.setProductId(1);
//		requestDto.setQuantity(1000);
//		CreateOrUpdateResponseDto responseDto = inventoryController.createOrUpdateInventory(requestDto);
//		System.out.println(responseDto);
//		PlaceOrderRequestDto placeOrderRequestDto = new PlaceOrderRequestDto();
//		placeOrderRequestDto.setUserId(1);
//		placeOrderRequestDto.setAddressId(1);
//		List<Pair<Integer, Integer>> lists = new ArrayList<>();
//		lists.add(Pair.of(1, 10));
//		lists.add(Pair.of(2, 117));
//		lists.add(Pair.of(3, 124));
//		lists.add(Pair.of(4, 105));
//		placeOrderRequestDto.setOrderDetails(lists);
//		PlaceOrderResponseDto responseDto = orderController.placeOrder(placeOrderRequestDto);
//		System.out.println(responseDto);
		DeliveryEstimateRequestDto requestDto = new DeliveryEstimateRequestDto();
		requestDto.setAddressId(1);
		requestDto.setProductId(1);
		DeliveryEstimateResponseDto responseDto = productController.estimateDeliveryTime(requestDto);
		System.out.println(responseDto);

	}
}
