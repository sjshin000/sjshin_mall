package com.ssj.admin.deal.model;

import com.ssj.common.util.BaseModelSupport;
import com.ssj.common.util.Paging;

import java.util.List;

/**
 * Created by sjshin on 2017-03-25.
 */
public class DealPage extends BaseModelSupport {
    private List<Deal> dealList;
    private Paging paging;

    public List<Deal> getDealList() {
        return dealList;
    }

    public void setDealList(List<Deal> dealList) {
        this.dealList = dealList;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}
