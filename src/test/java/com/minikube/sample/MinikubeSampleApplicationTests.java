// package com.minikube.sample;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.junit4.SpringRunner;

// @RunWith(SpringRunner.class)
// @SpringBootTest
// public class MinikubeSampleApplicationTests {

// 	@Test
// 	public void contextLoads() {
// 	}

// }


package com.minikube.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MinikubeSampleApplicationTests { // No 'public' here

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() { // No 'public' here
    }

    @Test
    void homeEndpointTest() throws Exception { // No 'public' here
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello from Dockerized Spring Boot App!"));
    }
}

