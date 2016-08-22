/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Jun
 */
@Named
@javax.enterprise.context.RequestScoped
public class hoge {

    private String s;

    public void validateS(FacesContext context,
            UIComponent component, Object value) {

        String text = value.toString();
        if (text.equals("shit")) {
            context.addMessage(component.getClientId(context),
                    new FacesMessage("下品はダメです"));
            ((UIInput) component).setValid(false);
        }
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

}
