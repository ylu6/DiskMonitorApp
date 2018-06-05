package org.ylu.diskmonitorwebapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class UsageHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;

    @ManyToOne
    @JoinColumn(name="disk_ID")
    private Disk disk;

    @ManyToOne
    @JoinColumn(name="user_ID")
    private User user;

    private Float used;

    public UsageHistory(Date dateTime, Disk disk, User user, Float used) {
        this.dateTime = dateTime;
        this.disk = disk;
        this.user = user;
        this.used = used;
    }
}
