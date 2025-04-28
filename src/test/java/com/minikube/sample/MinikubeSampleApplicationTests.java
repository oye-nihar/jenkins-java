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
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestPropertySource(properties = "server.port=8090")  // Use the same port for testing
@AutoConfigureMockMvc
class MinikubeSampleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
        // Simply checks Spring context loads without errors
    }

    @Test
    void mainMethodTest() {
        // This test will ensure that the main method runs without exceptions
        assertThatCode(() -> MinikubeSampleApplication.main(new String[]{}))
            .doesNotThrowAnyException();
    }

    @Test
    void homeEndpointTest() throws Exception {
        // This test ensures the home endpoint returns the expected message
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello from Dockerized Spring Boot App!"));
    }

    @Test
    void testApplicationStart() {
        // Test that the application starts properly (can be considered a coverage for the SpringApplication part)
        assertThatCode(() -> {
            SpringApplication application = new SpringApplication(MinikubeSampleApplication.class);
            application.setDefaultProperties(
                java.util.Collections.singletonMap("server.port", "8090"));
            application.run();
        }).doesNotThrowAnyException();
    }
}




