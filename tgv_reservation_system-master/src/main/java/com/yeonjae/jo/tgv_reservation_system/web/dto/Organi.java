package com.yeonjae.jo.tgv_reservation_system.web.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Organi {
    String academyId;
    String academyName;
    String academyDetail;
    String academyLogoUrl;
    String academyUrl;
    String count;
    String academyLoc;

    public Organi(String academyId,
            String academyName,
            String academyDetail,
            String academyLogoUrl,
            String academyUrl,
            String count,
            String academyLoc) {
        this.academyId = academyId;
        this.academyName = academyName;
        this.academyDetail = academyDetail;
        this.academyLogoUrl = academyLogoUrl;
        this.academyUrl = academyUrl;
        this.count = count;
        this.academyLoc = academyLoc;
    }
}
