
public class RequestHandler500 implements RequestHandlerInterface{
    RequestHandlerInterface nextHandler;
    public void authorise(Request req){
        if(req.getAmount()==500){
            System.out.println("Request handled !");
        }
        else{
            System.out.println("Could not handle request");
        }
    }

    public void setNextHandler(RequestHandlerInterface o){
        nextHandler=o;
    }

    public RequestHandlerInterface getNextHandler(){
        return nextHandler;
    }

}
