package com.gr.jiang.project.service;


import com.gr.jiang.project.po.ContentPo;

/**
 * Created by jiang on 15/12/24.
 */
public interface ContentService {
    public ContentPo queryContent(String id);
    public int queryRownum();
}
