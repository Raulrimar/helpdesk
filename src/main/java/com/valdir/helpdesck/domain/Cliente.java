package com.valdir.helpdesck.domain;

public class Cliente extends Pessoa { // com isso pega todos o satributos da classe pessoa
    private Chamado chamado = new Chamado();

    public Cliente() {
        super();
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }
    
    

}
