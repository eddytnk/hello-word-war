package com.eddytnk.helloworld.model;

/**
 * Author: Edward Tanko <br/>
 * Date: 8/4/20 8:37 AM <br/>
 */
public class HeathDTO {

    private String status;

    public HeathDTO() {
    }

    public HeathDTO(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
