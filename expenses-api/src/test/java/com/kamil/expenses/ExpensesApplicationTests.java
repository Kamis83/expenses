package com.kamil.expenses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest
class ExpensesApplicationTests {

    @Container
    public static final MySQLContainer MY_SQL_CONTAINER = new MySQLContainer();

    @BeforeAll
    public static void setUp() {
        System.setProperty("spring.datasource.url", String.format("jdbc:mysql://localhost:%d/test", MY_SQL_CONTAINER.getMappedPort(3306)));
    }

    @Test
    void contextLoads() {
        Assertions.assertThat(MY_SQL_CONTAINER.isRunning()).isTrue();
    }

}
