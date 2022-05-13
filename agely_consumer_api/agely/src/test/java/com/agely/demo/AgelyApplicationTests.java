package com.agely.demo;


import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest
class AgelyApplicationTests {

	@Test
	public void consumerAPI() {
		RestTemplate template = new RestTemplate();
		
		//https://sistemaagely.com.br:8345/recrutamentoagely/covid?service=uf&filter=mg
		
		URI uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("sistemaagely.com.br:8345")
				.path("recrutamentoagely/covid")
				.queryParam("?service=uf&filter=mg")				
				.build("");
		
		ResponseEntity<Pessoa> entity = template.getForEntity(uri.toString(), Pessoa.class);
		System.out.println(entity.getBody().getNome());
				
		
	}

}
