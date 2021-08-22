package edu.nyu.wiki.service;

import edu.nyu.wiki.Req.EbookReq;
import edu.nyu.wiki.mapper.EbookMapper;
import edu.nyu.wiki.model.Ebook;
import edu.nyu.wiki.model.EbookExample;
import edu.nyu.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper EbookMapper;

//    public List<Ebook> list() {
//        return EbookMapper.selectByExample(null);
//    }

    public List<EbookResp> list(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ebookReq.getName()+"%");
        List<Ebook> ebookList = EbookMapper.selectByExample(ebookExample);
        List<EbookResp> ebookRespList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            ebookRespList.add(ebookResp);
        }
        return ebookRespList;
    }
}
