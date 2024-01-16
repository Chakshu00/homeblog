package com.homeblog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeDto {
    private long id;

    private String title;
    private String description;
    private String content;
}
