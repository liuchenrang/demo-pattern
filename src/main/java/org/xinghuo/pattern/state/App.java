package org.xinghuo.pattern.state;

public class App  {
    public static void main(String[] args) {
        System.out.println("xx");
        Context context = new Context();
        context.setState(new StartState());
        State state = new StartState();
        state.doAction(context);

        System.out.println(context.getState());
    }
}
