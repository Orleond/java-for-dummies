package com.orleond.Try.Chapter5;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Authenticator4 {

    public static void main(String[] args) {
        UIManager.put("TextField.font", new Font("Dialog", Font.BOLD, 14));
        String username = JOptionPane.showInputDialog("Имя пользователя:");
        String password = JOptionPane.showInputDialog("Пароль:");

        if (username != null && password != null){
            if ((username.equals("bburd") &&
              password.equals("swordfish")) ||
             (username.equals("hritter") &&
              password.equals("preakston"))) {
                JOptionPane.showMessageDialog(null, "Вы допущены в систему.");
            } else {
                JOptionPane.showMessageDialog(null, "Попытайтесь еще раз...");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Недостаточно информации");
        }
    }
}
