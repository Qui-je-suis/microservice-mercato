/**
 * -------------------------------------------------------------------------
 * Copyright (C) 2019 QUI JE SUIS !!!. All rights reserved
 * -------------------------------------------------------------------------
 */
package mgb.mmercato.model;

import java.util.Date;

public class UserPlayer extends AvailablePlayer {

    private Integer pricePaid;
    private Date buyingDate;
    private Integer status;


    public UserPlayer(Integer pricePaid, Date buyingDate, Integer status) {
        super();
        this.pricePaid = pricePaid;
        this.buyingDate = buyingDate;
        this.status = status;
    }

    public Integer getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Integer pricePaid) {
        this.pricePaid = pricePaid;
    }

    public Date getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(Date buyingDate) {
        this.buyingDate = buyingDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
