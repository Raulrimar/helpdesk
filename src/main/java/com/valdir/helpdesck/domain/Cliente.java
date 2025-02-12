package com.valdir.helpdesck.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.valdir.helpdesck.domain.enums.Perfil;

@Entity
public class Cliente extends Pessoa { // com isso pega todos o satributos da classe pessoa

    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();
   

    public Cliente() {
        super();
        addPerfil(Perfil.CLIENTE);// desa forma quando um cliente for instanciado ele já recebe o perfil de cliente
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.CLIENTE);
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

}
