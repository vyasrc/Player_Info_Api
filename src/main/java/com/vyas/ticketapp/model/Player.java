package com.vyas.ticketapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Data
@Entity
@Table(name = "player", schema="public")
public class Player {

    @Id
    private Integer id;
    private Boolean status;
    private String number;
    private Instant updated;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Instant getUpdated() {
        return updated;
    }
    public void setUpdated(Instant updated) {
        this.updated = updated;
    }
}
