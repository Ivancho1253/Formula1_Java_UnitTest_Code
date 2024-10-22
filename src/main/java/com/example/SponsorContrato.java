package com.example;

public class SponsorContrato {
    
    private String ubicacion;
    private String fechaDesde;
    private String fechaHasta;
    private Sponsor sponsor;


    public SponsorContrato(String ubicacion, String fechaDesde, String fechaHasta, Sponsor sponsor) {
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

    public String getFechaDesde() {
        return fechaDesde;
    }

    private void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    private void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    private void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

}
