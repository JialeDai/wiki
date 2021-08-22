package edu.nyu.wiki.service;

import edu.nyu.wiki.mapper.EbookMapper;
import edu.nyu.wiki.model.Ebook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper EbookMapper;

    public List<Ebook> list() {

        return EbookMapper.selectByExample(null);
    }
}
