package edu.nyu.wiki.controller;

import edu.nyu.wiki.model.Ebook;
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
    public List<Ebook> list(){
        return EbookService.list();
    }
}
