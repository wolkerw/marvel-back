package com.example.marvel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@SpringBootTest(classes = MarvelApplication.class)
public class MarvelApplicationTest {

    @Test
    public void contextLoads() throws Exception {
    }

}