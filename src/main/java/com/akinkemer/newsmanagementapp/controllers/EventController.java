package com.akinkemer.newsmanagementapp.controllers;

import com.akinkemer.newsmanagementapp.domain.app.Announcement;
import com.akinkemer.newsmanagementapp.domain.app.News;
import com.akinkemer.newsmanagementapp.service.EventService;
import com.akinkemer.newsmanagementapp.utilities.results.DataResult;
import com.akinkemer.newsmanagementapp.utilities.results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @PostMapping("/news/save")
    public Result saveNews(@RequestBody News news) {
        return eventService.saveNews(news);
    }

    @PostMapping("/announcement/save")
    public Result saveNews(@RequestBody Announcement announcement) {
        return eventService.saveAnnouncement(announcement);
    }
    @GetMapping("/announcement/getAll")
    public DataResult<List<Announcement>> getAllAnnouncements() {
        return eventService.getAllAnnouncements();
    }
}