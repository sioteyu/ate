/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Desktop;
import java.net.URI;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class Mailer{
                
    public void mail(){
        try{ 
            final URI ismsurl = new URI("http://www.isms.com.my/isms_send.php?un=ATE&pwd=rewq1234&dstno=639061742525&msg=ATE%20System%20Accident%20Detected%20at%20Gil%20Puyat&type=1&sendid=639061742525");
            if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(ismsurl);
            }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
