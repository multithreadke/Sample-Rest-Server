package com.multi.rest.service;

import com.multi.rest.model.PostObject;
import com.multi.rest.repository.PostObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: git
 * Date: 07/09/2018
 * Time: 20:08
 */
@Service
public class IPostObjectService implements PostObjectService {

    @Autowired
    private PostObjectRepository postObjectRepository;

    @Override
    public List<PostObject> ShowPostObject() {
        return postObjectRepository.findAll();
    }

    @Override
    public PostObject SaveCreatePostObject(PostObject postObject) {
        return postObjectRepository.save(postObject);
    }

    @Override
    public PostObject GetObjectById(Long postObjectId) {
        return postObjectRepository.findByPostObjectId(postObjectId);
    }
}
