package com.dawn.command;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Dawn on 2020-04-05.
 */
public class DawnCommand extends BaseCommand {

    private static final long serialVersionUID = 6728803758219391461L;

   @NotEmpty(message = "姓名不能为空")
    private String name;

    private String addr;

    @NotBlank(message = "岗位不能为空")
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
