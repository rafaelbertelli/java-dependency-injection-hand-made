package com.rafael.di.service;

import com.rafael.di.model.Cliente;
import com.rafael.di.notification.INotificador;

public class AtivacaoClienteService {

    private INotificador notificador;

    public AtivacaoClienteService(INotificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativa();

        this.notificador.notificar(cliente, ">>> Seu cadastro no sistema está ativo");
    }
}
