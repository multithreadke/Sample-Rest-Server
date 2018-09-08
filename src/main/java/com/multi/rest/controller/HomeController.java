package com.multi.rest.controller;

import com.multi.rest.model.PostObject;
import com.multi.rest.service.PostObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: git
 * Date: 07/09/2018
 * Time: 20:07
 */

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private PostObjectService postObjectService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ResponseEntity<List<PostObject>> getPostObjectList()
    {
        return new ResponseEntity<>(postObjectService.ShowPostObject(), HttpStatus.OK);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public ResponseEntity<?> savePostObject(@RequestBody PostObject postObject)
    {
        PostObject saved = postObjectService.SaveCreatePostObject(postObject);
        if(saved.getPostObjectId() > 1)
        {
            return new ResponseEntity<>(saved, HttpStatus.OK);
        }else
            return new ResponseEntity<>("unable to save", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/posts/{postObjectId}", method = RequestMethod.GET)
    public ResponseEntity<PostObject> getObjectDataById(@PathVariable("postObjectId") Long postObjectId)
    {
        return new ResponseEntity<>(postObjectService.GetObjectById(postObjectId), HttpStatus.OK);
    }

}
