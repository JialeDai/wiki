package edu.nyu.wiki.controller;

import edu.nyu.wiki.Req.EbookReq;
import edu.nyu.wiki.resp.CommonResp;
import edu.nyu.wiki.resp.EbookResp;
import edu.nyu.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EbookController {
    @Resource
    private EbookService EbookService;

    @GetMapping("/ebook/list")
    public CommonResp<List<EbookResp>> list(EbookReq ebookReq){
        List<EbookResp> list = EbookService.list(ebookReq);
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        resp.setContent(list);
        return resp;
    }
}
