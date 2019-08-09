package gui;
import java.awt.*;
import javax.swing.*;

public class ProductInfo extends JFrame{

    private JLabel label;

    public ProductInfo(){

        super("Info");
        this.setSize(400,300);
        Dimension dim  = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#AEB6BF"));

        if(HomePage.homePage == true){
        label = new JLabel("<html>Name: "+HomePage.product.getProductName()     //from home page search
                                                    +"<br/>Price: "+HomePage.product.getPrice()
                                                       +"<br/>Quantity: "+HomePage.product.getAvailableQuantity()
                                                           +"</html>",SwingConstants.CENTER);
         HomePage.homePage=false;
        }
        else if(CustomerPage.customerPage == true){
        label = new JLabel("<html>Name: "+CustomerPage.product.getProductName() //from customer page search
                                                    +"<br/>Price: "+CustomerPage.product.getPrice()
                                                       +"<br/>Quantity: "+CustomerPage.product.getAvailableQuantity()
                                                           +"</html>",SwingConstants.CENTER);
        CustomerPage.customerPage=false;
        }
        else if(ManagerPage.managerPage == true){
         label = new JLabel("<html>Name: "+ManagerPage.product.getProductName() //from manager page search
                                                    +"<br/>Price: "+ManagerPage.product.getPrice()
                                                       +"<br/>Quantity: "+ManagerPage.product.getAvailableQuantity()
                                                           +"</html>",SwingConstants.CENTER);
         ManagerPage.managerPage=false;
        }
        else if(EmployeePage.employeePage == true){
         label = new JLabel("<html>Name: "+EmployeePage.product.getProductName()//from employee page search
                                                    +"<br/>Price: "+EmployeePage.product.getPrice()
                                                       +"<br/>Quantity: "+EmployeePage.product.getAvailableQuantity()
                                                           +"</html>",SwingConstants.CENTER);
         EmployeePage.employeePage=false;
        }
        label.setBounds(50,0, 300,290);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(label);


        this.add(panel);
    }


}
