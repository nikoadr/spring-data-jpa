package com.dailylesson.spring.data.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Niko Andrian on 10/2/2021
 * @project spring-data-jpa
 */
@Repository
public class ProductCategoryDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;



}
