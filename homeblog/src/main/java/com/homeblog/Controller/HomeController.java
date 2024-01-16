package com.homeblog.Controller;

import com.homeblog.Service.HomeService;
import com.homeblog.payload.HomeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class HomeController {

    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @PostMapping
    public ResponseEntity<HomeDto> createPost(@RequestBody HomeDto homeDto){
        HomeDto dto = homeService.createPost(homeDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
