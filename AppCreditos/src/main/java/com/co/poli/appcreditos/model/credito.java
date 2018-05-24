/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.appcreditos.model;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class credito {
    private String idCredito;
    private String Documento;
    private String Nommbres;
    
    private Double Monto;
    private String tipoTrabajador;
    private String tipoCredito;
    private Boolean activo;

    public credito(String idCredito, String Documento, String Nommbres, Double Monto, String tipoTrabajador, String tipoCredito, Boolean activo) {
        this.idCredito = idCredito;
        this.Documento = Documento;
        this.Nommbres = Nommbres;
        this.Monto = Monto;
        this.tipoTrabajador = tipoTrabajador;
        this.tipoCredito = tipoCredito;
        this.activo = activo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(String idCredito) {
        this.idCredito = idCredito;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNommbres() {
        return Nommbres;
    }

    public void setNommbres(String Nommbres) {
        this.Nommbres = Nommbres;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idCredito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final credito other = (credito) obj;
        if (!Objects.equals(this.idCredito, other.idCredito)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "credito{" + "idCredito=" + idCredito + ", Documento=" + Documento + ", Nommbres=" + Nommbres + ", Monto=" + Monto + ", tipoTrabajador=" + tipoTrabajador + ", tipoCredito=" + tipoCredito + ", activo=" + activo + '}';
    }
    
           
           
}
