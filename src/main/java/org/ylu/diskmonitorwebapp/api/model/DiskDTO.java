package org.ylu.diskmonitorwebapp.api.model;

import lombok.Data;

@Data
public class DiskDTO {
    private Long id;

    private String path;
    private String diskType;
    private Float capacity;
    private Float available;
}
