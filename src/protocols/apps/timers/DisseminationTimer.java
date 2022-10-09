package protocols.apps.timers;

import pt.unl.fct.di.novasys.babel.generic.ProtoTimer;

public class DisseminationTimer extends ProtoTimer {
    public static final short TIMER_ID = 301;

    public DisseminationTimer() {
        super(TIMER_ID);
    }

    @Override
    public ProtoTimer clone() {
        return this;
    }
}
