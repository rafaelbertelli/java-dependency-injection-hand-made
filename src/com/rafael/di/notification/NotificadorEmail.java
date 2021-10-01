package com.rafael.di.notification;

import com.rafael.di.model.Cliente;

public class NotificadorEmail implements INotificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf(">>> Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
