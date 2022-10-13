package com.revature;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

@SpringBootTest
@PropertySource("classpath:prod.properties")
class SocialMediaApplicationTests {

	@Test
	void contextLoads() {
	}

}
