package SpringbootBlogAPI.SpringbootBlogAPI;

import SpringbootBlogAPI.SpringbootBlogAPI.db.BlogDatabase;
import SpringbootBlogAPI.SpringbootBlogAPI.pojo.Blog;
import SpringbootBlogAPI.SpringbootBlogAPI.service.BlogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootBlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogApiApplication.class, args);
	}

	@PostConstruct
	public void fillDatabase(){
		BlogService blogService = new BlogService();
		blogService.fillDatabase();
	}
}
