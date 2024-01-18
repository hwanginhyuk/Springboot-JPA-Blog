package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogContollerTest {

		@GetMapping("/test/blog")
		public String hello() {
				return "<h1>hello spring boot</h1>";
		}
}
