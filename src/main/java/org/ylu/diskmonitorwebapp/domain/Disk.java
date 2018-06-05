package org.ylu.diskmonitorwebapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disk {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Float getAvailable() {
        return available;
    }

    public void setAvailable(Float available) {
        this.available = available;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String path;
    private String diskType;
    private Float capacity;
    private Float available;

    public Disk() {
    }

    public Disk(String path, String diskType, Float capacity, Float available) {
        this.path = path;
        this.diskType = diskType;
        this.capacity = capacity;
        this.available = available;
    }
}
