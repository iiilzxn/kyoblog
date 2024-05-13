package com.kayo.blog.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = blogModuleJwtApplicationTests.Application.class)
class blogModuleJwtApplicationTests {

    public static class Application {
    }

    @Test
    void contextLoads() {
    }

}
