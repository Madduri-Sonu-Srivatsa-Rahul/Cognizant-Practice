class Logger{
    // Private static instance of Logger
    private static Logger logger;

    // Private constructor 
    private Logger(){
        System.out.println("Logger Constructor");
    }

    // Instance Creation
    public static Logger getInstance(){
        if(logger == null)
            logger = new Logger();

        return logger;
    }
    public void print(String msg) {
        System.out.println("Message: " + msg);
    }
}