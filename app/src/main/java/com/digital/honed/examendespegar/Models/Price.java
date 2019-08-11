package com.digital.honed.examendespegar.Models;

import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("currency")
    private Currency currency;

    @SerializedName("final_price")
    private boolean final_price;

    @SerializedName("base")
    private int base;

    @SerializedName("best")
    private int best;
}
