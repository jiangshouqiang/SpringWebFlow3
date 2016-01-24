package com.gr.jiang.project.service.impl;

import com.gr.jiang.project.bo.ContentBo;
import com.gr.jiang.project.po.ContentPo;
import com.gr.jiang.project.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiang on 15/12/24.
 */
@Service("contentServiceImpl")
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentBo contentBo;
    @Override
    public ContentPo queryContent(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public int queryRownum() {
        System.out.println("num");
        return contentBo.queryRownum();
    }
}
