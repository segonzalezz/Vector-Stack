package Controller;

import Model.User;
import Model.VectorStack;
import Singleton.Singleton;


public class ControllerUser {
    private VectorStack<User> userStack;
    
    public ControllerUser(){
        userStack = Singleton.getInstance().readUser();
    }
    
    public boolean pushUser(User user, String id){
        if(checkUser(id)){
            userStack.push(user);
            Singleton.getInstance().writeUser(userStack);
            return true;     
        }
        return false;
    }
    
    public boolean checkUser(String id) {
        if (userStack != null) {
            for (int i = 0; i < userStack.getSize(); i++) {
                User user = userStack.getIndex(i);
                if (user != null && user.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

}
