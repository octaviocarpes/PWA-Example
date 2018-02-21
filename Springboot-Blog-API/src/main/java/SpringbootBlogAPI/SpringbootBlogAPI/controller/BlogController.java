package SpringbootBlogAPI.SpringbootBlogAPI.controller;


import SpringbootBlogAPI.SpringbootBlogAPI.db.BlogDatabase;
import SpringbootBlogAPI.SpringbootBlogAPI.pojo.Blog;
import SpringbootBlogAPI.SpringbootBlogAPI.service.BlogService;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BlogController {

    BlogService blogService;

    @CrossOrigin
    @RequestMapping(
            value = "/blogs",
            method = RequestMethod.GET
    )
    @ResponseBody
    public JSONArray getAllBlogs(){
        JSONArray result = new JSONArray();

        for (Blog blog:BlogDatabase.getInstance().getBlogList() ) {
            result.put(blog);
        }
        return result;
    }
}
