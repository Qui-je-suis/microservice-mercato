/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mmercato.model;

import java.util.Date;

public class UserPlayer extends AvailablePlayer {

    private Integer pricePaid;
    private Date buying_date;
    private Integer status;


    public UserPlayer(Integer pricePaid, Date buying_date, Integer status) {
        super();
        this.pricePaid = pricePaid;
        this.buying_date = buying_date;
        this.status = status;
    }

    public Integer getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Integer pricePaid) {
        this.pricePaid = pricePaid;
    }

    public Date getBuying_date() {
        return buying_date;
    }

    public void setBuying_date(Date buying_date) {
        this.buying_date = buying_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
