
public class Client {


    public static void main(String[]args){

        Client obj=new Client();





        obj.createAuthorizationFlow();

    }
    public void createAuthorizationFlow(){
        Request req=new Request(500);
        RequestHandler10 ten=new RequestHandler10();
        RequestHandler100 hundred=new RequestHandler100();
        RequestHandler500 fivehundred=new RequestHandler500();
        ten.setNextHandler(hundred);
        hundred.setNextHandler(fivehundred);
        ten.authorise(req);
    }
}
