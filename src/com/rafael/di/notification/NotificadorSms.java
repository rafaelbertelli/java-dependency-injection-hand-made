package com.rafael.di.notification;

import com.rafael.di.model.Cliente;

public class NotificadorSms implements INotificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf(">>> Notificando %s através do SMS %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
