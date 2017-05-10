
public class RequestHandler10 implements RequestHandlerInterface{
    RequestHandlerInterface nextHandler;
    public void authorise(Request req){
        if(req.getAmount()==10){
            System.out.println("Request handled !");
        }
        else{
            System.out.println("Going to 100handler");
            getNextHandler().authorise(req);
        }
    }

    public void setNextHandler(RequestHandlerInterface o){
        nextHandler=o;
    }

    public RequestHandlerInterface getNextHandler(){
        return nextHandler;
    }

}
