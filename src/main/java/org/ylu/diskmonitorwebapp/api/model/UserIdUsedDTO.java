package org.ylu.diskmonitorwebapp.api.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class UserIdUsedDTO {
    String userId;
    Float used;

    // copy constructor
    public UserIdUsedDTO(UserIdUsedDTO another) {
        this.userId = another.userId;
        this.used = another.used;
    }

    // merge
    public UserIdUsedDTO merge(UserIdUsedDTO another) {
        this.used += another.used;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Float getUsed() {
        return used;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsed(Float used) {
        this.used = used;
    }
}
