package com.example;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(JenkinCicdDemoApplication.class)
class JenkinCicdDemoApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGreetingsEndpoint() throws Exception {
		String name = "Sainath";

		mockMvc.perform(get("/greetings/{name}", name))
				.andExpect(status().isOk())
				.andExpect(content().string(
						"Hello " + name + " You can do it !!"
				));
	}
}