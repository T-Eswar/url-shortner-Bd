package com.urlShortner.in.Url_Shortner.repository;

import com.urlShortner.in.Url_Shortner.modules.UrlMapping;
import com.urlShortner.in.Url_Shortner.modules.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface UrlMappingRepository extends JpaRepository<UrlMapping,Long> {
    UrlMapping findByShortUrl(String shortUrl);
    List<UrlMapping> findByUser(User user);



}
