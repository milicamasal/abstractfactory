package view.factory.impl;

import components.IValue;
import components.fields.PanelInputTextField;

public class SimplePersonViewFactory implements AbstractFactory {

    @Override
    public IValue createPanelFirstName() {
        IValue panelFirstName = new PanelInputTextField();
        panelFirstName.setLabels("First name:", "");
        return panelFirstName;

    }

    @Override
    public IValue createPanelLastName() {
        IValue panelLastName = new PanelInputTextField();
        panelLastName.setLabels("Last name:", "");
        return panelLastName;
    }

    @Override
    public IValue createPanelDate() {
        IValue panelDate = new PanelInputTextField();
        panelDate.setLabels("Date od birth:", "");
        return panelDate;
    }

    @Override
    public IValue createPanelGender() {
        IValue panelGender = new PanelInputTextField();
        panelGender.setLabels("Gender:", "");
        return panelGender;
    }

}
