package com.orleond.Try.Chapter5;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Authenticator3 {

    public static void main(String[] args) {
        UIManager.put("TextField.font", new Font("Dialog", Font.BOLD, 14));
        String username = JOptionPane.showInputDialog("Имя пользователя:");
        String password = JOptionPane.showInputDialog("Пароль:");

        if (!(username == null || password == null) &&
            (((username.equals("bburd") || username.equals("BBURD")) &&
              password.equals("swordfish")) ||
             ((username.equals("hritter") || username.equals("HRITTER")) &&
              password.equals("preakston"))
            )
        ) {
            JOptionPane.showMessageDialog(null, "Вы допущены в систему.");
        } else {
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз...");
        }
    }
}
