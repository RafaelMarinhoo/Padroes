package br.edu.ifpb.padroes.storewebv3.service.command;

import br.edu.ifpb.padroes.storewebv3.facade.OrderFacade;

public abstract class Command
{
    protected OrderFacade facade;

    public Command(OrderFacade facade)
    {
        this.facade = facade;
    }

    public abstract boolean execute();
}
