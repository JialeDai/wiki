package edu.nyu.wiki.service;

import edu.nyu.wiki.mapper.TestMapper;
import edu.nyu.wiki.model.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
