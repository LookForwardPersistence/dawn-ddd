package com.dawn.core.entity;

import org.dayatang.domain.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Dawn on 2020-04-04.
 */
@Entity
@Table(name = "dawn")
public class DawnEntity extends AbstractEntity {
    private static final long serialVersionUID = -7845541378767085738L;

    @Column(name = "name")
    private String name;

    @Column(name = "addr")
    private String addr;

    @Column(name = "job")
    private String job;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
