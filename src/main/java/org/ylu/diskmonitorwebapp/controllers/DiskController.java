package org.ylu.diskmonitorwebapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.ylu.diskmonitorwebapp.api.model.DiskAvailableDTO;
import org.ylu.diskmonitorwebapp.api.model.DiskDTO;
import org.ylu.diskmonitorwebapp.api.model.DiskListDTO;
import org.ylu.diskmonitorwebapp.domain.Disk;
import org.ylu.diskmonitorwebapp.services.DiskService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(DiskController.BASE_URL)
public class DiskController {

    public static final String BASE_URL = "/api/disks";

    private final DiskService diskService;

    public DiskController(DiskService diskService) {
        this.diskService = diskService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public DiskListDTO getListOfDisks() {
        return new DiskListDTO(diskService.getAllDisks());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DiskDTO getDiskById(@PathVariable Long id) {
        return diskService.getDiskById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String updateDiskAvailable(@RequestBody DiskAvailableDTO[] diskAvailableDTOs) {
        for(DiskAvailableDTO dto: diskAvailableDTOs)
            diskService.updateDiskAvailable(dto);
        return "Available space of all disks are successfully updated.";
    }
}
