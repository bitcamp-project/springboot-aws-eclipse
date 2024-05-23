package com.coeding.springboot.aws.web;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(SpringRunner.class)// on JUnit4
//@SpringBootTest	// 전체 /test 에서 1번만 선언되야 함.
@WebMvcTest(controllers = HelloApiController.class)
public class HelloApiControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void apiHello() {
		try {
			mvc.perform(get("/api/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string(new String("hello")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
