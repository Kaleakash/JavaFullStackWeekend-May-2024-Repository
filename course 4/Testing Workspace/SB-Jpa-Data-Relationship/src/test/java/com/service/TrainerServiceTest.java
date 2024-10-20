package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entity.Trainer;

@SpringBootTest
class TrainerServiceTest {								// 
		
	@Autowired											// @Autowired ProductController productController 
	TrainerService trainerService;
	
	@Test
	//@Disabled
	void testFindAllTrainer() {
	List<Trainer> listOfTrainer	= trainerService.findAllTrainer();
	assertNotNull(listOfTrainer);		// memory of list must be there 
	assertEquals(3, listOfTrainer.size());
	Trainer t = listOfTrainer.get(0);
	assertEquals(102, t.getTid());
	assertEquals("Ramesh", t.getTname());
	assertEquals("Basic Angular", t.getTech());
	assertEquals(3, t.getStudents().size());
	}

	@Test
	@Disabled
	void testStoreTrainer() {
		Trainer t = new Trainer();
		t.setTid(104);
		t.setTname("Steven");
		t.setTech("Spring boot");
		String result1 = trainerService.storeTrainer(t);
		assertEquals("Trainer details stored", result1);
		String result2 = trainerService.storeTrainer(t);
		assertEquals("Trainer id must be unique", result2);
	}

	@Test
	@Disabled
	void testDeleteTrainerDetails() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testUpdateTrainerTechnology() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFindTrainerById() {
		fail("Not yet implemented");
	}

}
