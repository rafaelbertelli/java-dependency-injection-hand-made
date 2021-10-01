package com.rafael.di.notification;

import com.rafael.di.model.Cliente;

public interface INotificador {
    void notificar(Cliente cliente, String mensagem);
}
