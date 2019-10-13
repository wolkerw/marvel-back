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

    /*@Test
    public void getProductsList() throws Exception {
        String uri = "/products";
        /*MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
            .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();*/
        /*MarvelRepository marvelRepository;
        marvelRepository.getHeroId("name");
        
        int status = marvelRepository.getClass().ge getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Product[] productlist = super.mapFromJson(content, Product[].class);
        assertTrue(productlist.length > 0);
    }*/

//     @Test
// public void whenGetHeroId_thenReturnId() {
//     // given
//     /*Employee alex = new Employee("alex");
//     entityManager.persist(alex);
//     entityManager.flush();*/

//     MarvelRepository marvelRepository;
//         // when
//     //Quote heroIdObject = getForObject("https://gateway.marvel.com/v1/public/characters?ts=1570805269&apikey=270ff4d25823b87e94d50bcc9f197996&hash=f0bff4e5f6dbfce6286cb36a986e6527&name=Captain America&limit=1", Quote.class);
//     /*Quote heroIdObject = */marvelRepository.getHeroId ("Captain America");
 
//     // then
//     /*assertThat(heroIdObject.getData())
//     .doesNotContainNull()*/

// /*  .hasSize(9)
//   .contains(frodo, sam)
//   .doesNotContain(sauron);
//     assertThat(heroIdObject.getData())
//       .isEqualTo(alex.getName())*/;
// }

}