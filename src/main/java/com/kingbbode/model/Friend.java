package com.kingbbode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by YG-MAC on 2017. 4. 9..
 */
@Entity
@Table(name = "friend")
public class Friend {
    @Id
    private Long idx;

    @Column
    private String name;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
