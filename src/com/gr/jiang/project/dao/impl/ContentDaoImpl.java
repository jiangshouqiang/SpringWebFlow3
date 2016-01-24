package com.gr.jiang.project.dao.impl;

import com.gr.jiang.project.dao.ContentDao;
import com.gr.jiang.project.po.ContentPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jiang on 15/12/23.
 */
@Repository
@Transactional
public class ContentDaoImpl implements ContentDao {

    private JdbcTemplate jdbcTemplate ;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public ContentPo queryContent(String id) {
        return null;
    }

    @Override
    public int queryRownum()  {
        return jdbcTemplate.queryForObject("SELECT COUNT(1) FROM content",Integer.class);
    }

    @Override
    public List<ContentDao> queryPage(int start, int limit) {
        return null;
    }
}
