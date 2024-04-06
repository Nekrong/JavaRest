package org.donstu.domain;

import java.io.Serializable;
import java.util.List;

public class ComputerClub implements Serializable {
    private List<java.lang.Package> Packages;

    private List<Computer> computers;

    private List<Reservation> reservations;

    public List<java.lang.Package> getPaths() {
        return Packages;
    }

    public void setPaths(List<java.lang.Package> aPackages) {
        this.Packages = aPackages;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
