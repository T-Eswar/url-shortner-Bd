package com.urlShortner.in.Url_Shortner.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class ClickEventDTO {
    private LocalDateTime clickDate;
    private Long count;
}
