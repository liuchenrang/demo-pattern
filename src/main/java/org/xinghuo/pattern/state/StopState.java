package org.xinghuo.pattern.state;

public class StopState implements State {
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("stop state");

    }
    public String toString(){
        return "stop state";

    }
}
