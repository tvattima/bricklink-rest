package com.bricklink.api.rest.model.v1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Shipping {
    private String method;              //	String	Shipping method name
    private String method_id;           //	String	Shipping method ID
    private String tracking_no;         //	String	Tracking numbers for the shipping
    private String tracking_link;       //	String	URL for tracking the shipping	API-only field. It is not shown on the BrickLink pages.
    private LocalDateTime date_shipped; //	Timestamp	Shipping date	API-only field. It is not shown on the BrickLink pages.
    private Address address;            //	Object	The object representation of the shipping address	API - Name data normalization

}
