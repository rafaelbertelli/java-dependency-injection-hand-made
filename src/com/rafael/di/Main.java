package com.rafael.di;

import com.rafael.di.model.Cliente;
import com.rafael.di.notification.INotificador;
import com.rafael.di.notification.NotificadorEmail;
import com.rafael.di.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@melao.com.br", "2345678");
        Cliente maria = new Cliente("Maria", "maria@homem.com.br", "89292989");

        INotificador notificador = new NotificadorEmail();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);
    }
}
