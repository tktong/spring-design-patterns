package me.tktong.restaurant;

import com.fasterxml.jackson.annotation.JsonProperty;

class OrderSubmitted {
    private boolean successful;

    @JsonProperty("success")
    boolean isSuccessful() {
        return successful;
    }

    void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
