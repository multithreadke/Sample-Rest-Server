package com.multi.rest.repository;

import com.multi.rest.model.PostObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: git
 * Date: 07/09/2018
 * Time: 20:07
 */
@Repository
public interface PostObjectRepository extends JpaRepository<PostObject, Long> {
    PostObject findByPostObjectId(Long id);
}
