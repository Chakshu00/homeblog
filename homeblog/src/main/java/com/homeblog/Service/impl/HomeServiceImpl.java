package com.homeblog.Service.impl;

import com.homeblog.Entity.Home;
import com.homeblog.Repository.HomeRepository;
import com.homeblog.Service.HomeService;
import com.homeblog.payload.HomeDto;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    private HomeRepository homeRepository;

    //Instead of @Autowired You can use this constructor
    public HomeServiceImpl(HomeRepository homeRepository) {

        this.homeRepository = homeRepository;
    }

    @Override
    public HomeDto createPost(HomeDto homeDto) {
        Home home = new Home();
        home.setTitle(homeDto.getTitle());
        home.setDescription(homeDto.getDescription());
        home.setContent(homeDto.getContent());
        Home savedPost = homeRepository.save(home);

        HomeDto dto= new HomeDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto;
    }
}
