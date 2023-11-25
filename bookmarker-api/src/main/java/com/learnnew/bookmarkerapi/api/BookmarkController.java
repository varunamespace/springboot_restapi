package com.learnnew.bookmarkerapi.api;

import com.learnnew.bookmarkerapi.domain.BookmarksDTO;
import com.learnnew.bookmarkerapi.domain.Bookmark;
import com.learnnew.bookmarkerapi.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookmarkController {
    @Autowired
    private final BookmarkService bookmarkService;
    @RequestMapping("/index")
    public String helloBookmark(){
        return "Hello bookmarks";
    }
    @RequestMapping("/bookmarks")
    public BookmarksDTO getByPage(@RequestParam(name = "page",defaultValue = "1") Integer page)
    {
        System.out.println("bookmark");
        return bookmarkService.getBookmarks(page);

    }
    @RequestMapping("/bookmark")
    public List<Bookmark> getAll(){
        return bookmarkService.getAllBookmarks();
    }
}
