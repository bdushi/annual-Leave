package de.dlh.lhind.annualleave;

import de.dlh.lhind.annualleave.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnualLeaveApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {

	}
}
