package com.senai.atividade.models.enums;

public enum Setor {
    JURIDICO("Juridico"),
    ENGENHARIA("Engenharia"),
    SAUDE("Saude");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
