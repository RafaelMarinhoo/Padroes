package br.edu.ifpb.padroes.storewebv3.service.command;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Invocador {
    private ArrayList<Command> commands = new ArrayList<Command>();;
    
    public void addCommand(Command command)
    {
        commands.add(command);
    }

    public void executeCommands()
    {
        for(int i=0; i<commands.size(); i++)
        {
        	commands.get(i).execute();
        	commands.remove(i);
        }
    }
}
