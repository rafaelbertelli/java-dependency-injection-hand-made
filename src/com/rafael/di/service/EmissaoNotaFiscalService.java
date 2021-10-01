package com.rafael.di.service;

import com.rafael.di.model.Cliente;
import com.rafael.di.model.Produto;
import com.rafael.di.notification.INotificador;
import com.rafael.di.notification.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private INotificador notificador;

    public EmissaoNotaFiscalService(INotificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        System.out.printf(">>> A nota fiscal está sendo emitida para o cliente %s, produto %s, valor R$ %s",
                cliente.getNome(), produto.getNome(), produto.getValorTotal());

        this.notificador.notificar(cliente,
                ">>> Nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }
}
