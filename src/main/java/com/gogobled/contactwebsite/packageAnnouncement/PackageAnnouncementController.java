package com.gogobled.contactwebsite.packageAnnouncement;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/package-announcement")
@RequiredArgsConstructor
public class PackageAnnouncementController {

    private final PackageAnnouncementService packageAnnouncementService;

    @GetMapping("/{id}")
    public PackageAnnouncement getById(@PathVariable final int id) {
        return packageAnnouncementService.getById(id);
    }

    @GetMapping("/all")
    public List<PackageAnnouncement> all() {
        return packageAnnouncementService.all();
    }

    @PostMapping("/add")
    public void add(@RequestBody final PackageAnnouncementRequest request) {
        packageAnnouncementService.add(request);
    }

    @PutMapping("/{id}/update")
    public void update(@PathVariable final int id, @RequestBody final PackageAnnouncementRequest request) {
        packageAnnouncementService.update(id, request);
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable final int id) {
        packageAnnouncementService.delete(id);
    }

}
