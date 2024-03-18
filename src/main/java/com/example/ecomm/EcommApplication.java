package com.example.ecomm;

import com.example.ecomm.controllers.InventoryController;
import com.example.ecomm.dtos.CreateOrUpdateRequestDto;
import com.example.ecomm.dtos.CreateOrUpdateResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommApplication implements CommandLineRunner {
	@Autowired
	InventoryController inventoryController;

	public static void main(String[] args) {
		SpringApplication.run(EcommApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CreateOrUpdateRequestDto requestDto = new CreateOrUpdateRequestDto();
		requestDto.setUserId(1);
		requestDto.setProductId(1);
		requestDto.setQuantity(1000);
		CreateOrUpdateResponseDto responseDto = inventoryController.createOrUpdateInventory(requestDto);
		System.out.println(responseDto);

	}
}
