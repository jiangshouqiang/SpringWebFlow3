package com.gr.jiang.project.dao;



import com.gr.jiang.project.po.ContentPo;

import java.util.List;

/**
 * Created by jiang on 15/12/23.
 * 内容信息模块
 */

public interface ContentDao {
    /**
     * 分页查询新闻信息
     * @param start
     * @param limit
     * @return
     */
    public List<ContentDao> queryPage(int start, int limit);

    /**
     * 查询新闻详细信息
     * @param id
     * @return
     */
    public ContentPo queryContent(String id);

    /**
     * 查询新闻信息总条数
     * @return
     */
    public int queryRownum() ;
}
