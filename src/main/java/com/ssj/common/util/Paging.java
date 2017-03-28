package com.ssj.common.util;

import java.util.List;

/**
 * Created by sjshin on 2017-03-23.
 */
public class Paging extends BaseModelSupport {
    private int currentPageNo;
    private int totalCount;
    private int totalPageCount;

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(int currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
