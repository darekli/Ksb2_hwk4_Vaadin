package ksb2_cars_Vaadin_hwk4_v2;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

interface buttonReturn {

    default Button addButtonReturn() {
        Button buttonReturn = new Button("Return", new Icon(VaadinIcon.HOME));
        buttonReturn.addClickListener(buttonClickEvent -> buttonReturn.getUI().ifPresent(ui -> ui.navigate("home")));
        return buttonReturn;

    }

}
