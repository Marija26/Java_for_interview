package com.company.Patterns;

/**
 * Created by Маша on 27.04.2017.
 */
public class Command {
    public static void main(String[] args) {
        Comp c = new Comp();
        Usser u = new Usser(new StartCommand(c),new StopCommand(c), new ResetCommand(c));

    }
}
interface Command_{
    void execute();

}
class Comp {
    void start(){
        System.out.println("Start");
    }
    void stop(){
        System.out.println("Stop");
    }
    void reset(){
        System.out.println("Reset");}
}

class StartCommand implements Command_{
    Comp computer;
    public StartCommand(Comp computer){
        this.computer = computer;}

    @Override
    public void execute() {
        computer.start();
    }
}
class StopCommand implements Command_ {
    Comp computer;

    public StopCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
class ResetCommand implements Command_ {
    Comp computer;

    public ResetCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}

class Usser{
    Command_ start;
    Command_ stop;
    Command_ reset;
    public Usser(Command_ start, Command_ stop, Command_ reset){
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

void startComputer(){
    start.execute();}
    void stopComputer(){
        stop.execute();}
    void resetComputer(){
        reset.execute();
    }
}
