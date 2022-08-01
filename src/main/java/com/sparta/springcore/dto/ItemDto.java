package com.sparta.springcore.dto;

import lombok.Getter;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
public class ItemDto {
    private String title;
    private String link;
    private String image;
    private int lprice;
}