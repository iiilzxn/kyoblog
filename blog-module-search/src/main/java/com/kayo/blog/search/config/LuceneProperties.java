package com.kayo.blog.search.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "lucene")
@Component
@Data
public class LuceneProperties {
    private String indexDir;
}
