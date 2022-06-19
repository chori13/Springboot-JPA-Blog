package com.chori.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 스피링이 com.chori.blog 패키지 이하를 스캔해서 모든 파일을 메로리에  new하는 것은 아니구요.
					// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(Ioc) 스프링 컨테이너에 관리해줍니다.
public class BlogContorollerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";		
	}
}
