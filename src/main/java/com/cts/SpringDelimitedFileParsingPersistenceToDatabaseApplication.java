package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.fileread.DelimitedFileRead;

@SpringBootApplication
public class SpringDelimitedFileParsingPersistenceToDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDelimitedFileParsingPersistenceToDatabaseApplication.class, args);
        //initializing reading file file
		DelimitedFileRead obj = new DelimitedFileRead();
		DelimitedFileRead.readfile();
	}

}
