package org.xinghuo.pattern.state;

public class StartState implements State {
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("start state");

    }
    public String toString(){
        return "start state";
    }
}
