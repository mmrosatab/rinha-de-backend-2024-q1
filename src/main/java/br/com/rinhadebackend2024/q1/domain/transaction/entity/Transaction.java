package br.com.rinhadebackend2024.q1.domain.transaction.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Transaction {

    private Integer id;
    private Integer clientId;
    private Integer valor;
    private char tipo;
    private String descricao;
    private LocalDateTime realizadaEm;

    public Transaction(Integer clientId, Integer valor, char tipo, String descricao) {
        this.clientId = clientId;
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.realizadaEm = LocalDateTime.now();
    }
}