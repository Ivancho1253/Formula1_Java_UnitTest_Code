package com.example;
import java.time.LocalDate;

public class SponsorContrato {
    
    private String ubicacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private Sponsor sponsor;


    public SponsorContrato(String ubicacion, LocalDate fechaDesde, LocalDate fechaHasta, Sponsor sponsor) {
        setUbicacion(ubicacion);
        setFechaDesde(fechaDesde);
        setFechaHasta(fechaHasta);
        setSponsor(sponsor);
    }

    public String getUbicacion() {
        return ubicacion;
    }

    private void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    private void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    private void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    private void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

}
