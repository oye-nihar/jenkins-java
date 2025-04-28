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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class MinikubeSampleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    public void homeEndpointTest() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello from Dockerized Spring Boot App!"));
    }
}
