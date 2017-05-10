
public interface RequestHandlerInterface {
    public void authorise(Request req);
    public void setNextHandler(RequestHandlerInterface obj);
    public RequestHandlerInterface getNextHandler();
}
