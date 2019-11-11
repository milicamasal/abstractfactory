package view.factory.impl;

import components.IValue;
import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.util.ArrayList;
import java.util.List;

public class AdvancedPersonViewFactory implements AbstractFactory {

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
        IValue panelDate = new PanelInputDate();
        panelDate.setLabels("Date of birth", "");
        return panelDate;
    }

    @Override
    public IValue createPanelGender() {
        IValue panelGender = new PanelInputComboBox();
        List<Gender> genders = new ArrayList<>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        panelGender.initialize(genders);
        panelGender.setLabels("Gender:", "");
        return panelGender;
    }

}
