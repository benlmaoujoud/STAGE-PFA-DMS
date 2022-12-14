package com.dms.management;


import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dms.management.service.FilesStorageService;

@SpringBootApplication
public class DmsManagementSpringApplication implements CommandLineRunner {
	@Resource
	FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(DmsManagementSpringApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();
		
	}

}
