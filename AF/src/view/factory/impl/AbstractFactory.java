package view.factory.impl;

import components.IValue;

public interface AbstractFactory {

    IValue createPanelFirstName();
    IValue createPanelLastName();
    IValue createPanelDate();
    IValue createPanelGender();

}
