package com.ssj.common.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sjshin on 2017-03-23.
 */
public class PagingUtils {
    public static Paging getPaging(List<?> totalData, int count) {
        Paging paging = new Paging();

        int size = totalData.size();
        if (size > 0 && size <= count) {
            paging.setCurrentPageNo(1);
        }
        return null;
    }

    /**
     * 1: 0, 10 / 2: 10, 10 / 3: 20, 10
     * @param pageNo
     * @param divideRecode
     * @return
     */
    public static Map<String, Integer> getSelectPageNumbers(int pageNo, int divideRecode) {
        int startNo = (pageNo - 1) * divideRecode;
        Map<String, Integer> params = new HashMap<>();
        params.put("startNo", startNo);
        params.put("endNo", divideRecode);
        params.put("endNo", divideRecode);

        return params;
    }

    public static Map<String, Object> getSelectPageNumbers(int pageNo, int divideRecode, String searchWord) {
        int startNo = (pageNo - 1) * divideRecode;
        Map<String, Object> params = new HashMap<>();
        params.put("startNo", startNo);
        params.put("endNo", divideRecode);
        params.put("searchWord", searchWord);

        return params;
    }
}
