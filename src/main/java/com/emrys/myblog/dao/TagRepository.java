package com.emrys.myblog.dao;

import com.emrys.myblog.po.Tag;
import com.emrys.myblog.po.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long>{

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
