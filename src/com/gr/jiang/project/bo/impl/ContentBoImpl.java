package com.gr.jiang.project.bo.impl;

import com.gr.jiang.project.bo.ContentBo;
import com.gr.jiang.project.dao.ContentDao;
import com.gr.jiang.project.po.ContentPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jiang on 15/12/24.
 */
@Component
public class ContentBoImpl implements ContentBo {
    @Autowired
    private ContentDao contentDao;
    @Override
    public ContentPo queryContent(@Value("1") String id) {
        return null;
    }

    @Override
    public int queryRownum() {
        return contentDao.queryRownum();
    }
}
