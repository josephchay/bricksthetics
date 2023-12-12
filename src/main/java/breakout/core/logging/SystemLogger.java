package breakout.core.logging;

import breakout.core.logging.tags.LogType;

public class SystemLogger extends Logger {
    private static SystemLogger instance;

    public static synchronized SystemLogger getInstance() {
        if (instance == null) {
            instance = new SystemLogger();
        }

        return instance;
    }

    private SystemLogger() {}

    @Override
    protected LogType defineType() {
        return LogType.SYSTEM;
    }
}
