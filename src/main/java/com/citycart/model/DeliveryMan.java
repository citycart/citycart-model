package com.citycart.model;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by otm on 29/10/16.
 */
public class DeliveryMan extends Person {

    private String id;
    private DeliveryManStatus currentStatus;
    private Set<DeliveryManStatus> statusHistory;
    private LocalDateTime creationDate;

    public DeliveryMan() {
    }

    public DeliveryMan(DeliveryManStatus currentStatus, Set<DeliveryManStatus> statusHistory) {
        this.currentStatus = currentStatus;
        this.statusHistory = statusHistory;
    }

    public String getId() {
        return id;
    }

    public DeliveryManStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(DeliveryManStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Set<DeliveryManStatus> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(Set<DeliveryManStatus> statusHistory) {
        this.statusHistory = statusHistory;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "DeliveryMan{" +
                "id='" + id + '\'' +
                ", currentStatus=" + currentStatus +
                ", statusHistory=" + statusHistory +
                '}';
    }
}
