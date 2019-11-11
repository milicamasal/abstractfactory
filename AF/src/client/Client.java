package client;

import components.IValue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.FrmPersonView;
import view.factory.impl.AbstractFactory;
import view.factory.impl.AdvancedPersonViewFactory;
import view.factory.impl.SimplePersonViewFactory;


public class Client {

    AbstractFactory factory;
    JPanel panel;
    IValue panelFirstName;
    IValue panelLastName;
    IValue panelDate;
    IValue panelGender;
    
    public Client(AbstractFactory c) {
        factory= c;
        panel = new FrmPersonView();
        panel.setLayout(new GridLayout(4, 1));
    }

    JPanel create() {
        panelFirstName = factory.createPanelFirstName();
        panelLastName = factory.createPanelLastName();
        panelDate = factory.createPanelDate();
        panelGender = factory.createPanelGender();
        panel.add((JPanel)panelFirstName);
        panel.add((JPanel)panelLastName);
        panel.add((JPanel)panelDate);
        panel.add((JPanel)panelGender);
        return panel;
    }

    public static void main(String[] args) {
        JFrame main = new JFrame();
        SimplePersonViewFactory spw = new SimplePersonViewFactory();
        Client client = new Client(spw);
        main.add(client.create());
        main.pack();
        main.setVisible(true);

//        AdvancedPersonViewFactory apv = new AdvancedPersonViewFactory();
//       client = new Client(apv);
//        main.add(client.create());
//
//        main.pack();
//        main.setVisible(true);
//    
    }

}
