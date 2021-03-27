package com.emrys.myblog.dao;

import com.emrys.myblog.po.Type;
import com.emrys.myblog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
