package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostsController {

    @GetMapping("/posts")
    public String showAll(Model vmodel) {

        ArrayList<Post> posts = new ArrayList<>();

        posts.add(new Post("Example 1", "1"));

        vmodel.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String id(@PathVariable int id, Model vModel) {

        Post post = new Post("Example 1","hello");


        vModel.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String create() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    public String postCreate() {
        return "create a new post";
    }
}
