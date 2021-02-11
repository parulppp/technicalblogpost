package com.parul.batish.controller;

import com.parul.batish.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
@Controller
public class HomeController {
@RequestMapping("/getallposts")
    public String getAllPosts(Model model){
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Mirzapur");
        post1.setBody("Kaleen Bhaiya ki sarkar");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Gangs of Wassepur");
        post2.setBody("keh ke lenge");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Kissan");
        post3.setBody("Modi ki sarkar");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);

        return "index";

    }
}