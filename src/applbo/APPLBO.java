/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applbo;

/**
 *
 * @author User
 */


public class APPLBO {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        koneksi connection = new koneksi();
        userHome user = new userHome();
        user.setVisible(true);
//        login log = new login();
//        log.setVisible(true);
    }
    
}
