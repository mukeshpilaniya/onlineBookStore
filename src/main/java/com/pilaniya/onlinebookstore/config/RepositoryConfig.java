package com.pilaniya.onlinebookstore.config;

import com.pilaniya.onlinebookstore.entity.Book;
import com.pilaniya.onlinebookstore.entity.BookCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
        config.exposeIdsFor(Book.class);
        config.exposeIdsFor((BookCategory.class));
    }
}
