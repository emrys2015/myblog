package com.emrys.myblog.service;

import com.emrys.myblog.po.Blog;
import com.emrys.myblog.po.Tag;
import com.emrys.myblog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTagTop(Integer size);

    List<Tag> listTag(String ids);

    Tag updateTag(Long id, Tag type);

    void deleteTag(Long id);
}


