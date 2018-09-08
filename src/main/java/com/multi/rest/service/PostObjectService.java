package com.multi.rest.service;

import com.multi.rest.model.PostObject;

import java.util.List;

/**
 * User: git
 * Date: 07/09/2018
 * Time: 20:08
 */
public interface PostObjectService {
    List<PostObject> ShowPostObject();
    PostObject SaveCreatePostObject(PostObject postObject);
    PostObject GetObjectById(Long postObjectId);
}

