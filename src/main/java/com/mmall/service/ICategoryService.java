package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by tony on 27/06/2017.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
}

