package Controller;

import Model.User;
import Model.VectorStack;
import Singleton.Singleton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ControllerUser {
    private VectorStack<User> userStack;
    
    public ControllerUser(){
        userStack = Singleton.getInstance().readUser();
    }
    
    public boolean pushUser(User user, String id){
        if(!checkUser(id)){
            userStack.push(user);
            Singleton.getInstance().writeUser(userStack);
            return true;     
        }
        return false;
    }
    
    public boolean popUser(String id){
        if(!checkUser(id)){
            for(int i = 0; i< userStack.getSize();  i++){
                User user = userStack.getIndex(i);
                if(user.getId().equals(id)){
                    userStack.pop();
                    Singleton.getInstance().writeUser(userStack);
                    return true;
                }
            }
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
    
    public void updateTable(JTable table, String[] columns){
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        table.setModel(model);
        for(int i = 0; userStack != null && i < userStack.getSize(); i++){
            if(userStack.getIndex(i) instanceof User){
                User aux = (User) userStack.getIndex(i);
                Object[] register = {aux.getId(), aux.getName(), aux.getDateBorn()};
                model.addRow(register);
            }
        }
    }
}
