package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * @author tianyi.
 * @date 2019/10/30.
 * @time 16:28.
 */
public interface ICategoryService {
     ServerResponse addCategory(String categoryName, Integer parentId);
     ServerResponse updateCategoryName(Integer categoryId,String categoryName);
}
