package com.valdir.helpdesck.domain.enums;
import java.lang.IllegalArgumentException;

public enum Estatus {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    private Estatus(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Estatus toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (Estatus x : Estatus.values()) {
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Estatus inválido: " + cod);
    }
}
