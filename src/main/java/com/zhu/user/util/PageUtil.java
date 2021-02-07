package com.zhu.user.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageSerializable;
import lombok.Data;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
public class PageUtil<T>{
    private int pageNum;
    private int pageSize;
    private long total;
    private List<T> list;


    public PageUtil(List<T> list) {
        this.list = Collections.EMPTY_LIST;
        PageInfo pageInfo = new PageInfo(list);
        this.pageNum = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.total=pageInfo.getTotal();
        this.list = pageInfo.getList();
    }
    public static<T> PageUtil<T> trans(List<T> list) {
       return  new PageUtil<T>(list);
    }
}
