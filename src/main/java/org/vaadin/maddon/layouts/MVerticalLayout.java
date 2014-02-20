package org.vaadin.maddon.layouts;

import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public class MVerticalLayout extends VerticalLayout {

    public MVerticalLayout() {
        super.setSpacing(true);
        super.setMargin(true);
    }

    public MVerticalLayout(Component... components) {
        this();
        addComponents(components);
    }
    
    public MVerticalLayout with(Component... components) {
        addComponents(components);
        return this;
    }


    public MVerticalLayout withSpacing(boolean spacing) {
        setSpacing(spacing);
        return this;
    }

    public MVerticalLayout withMargin(boolean marging) {
        setMargin(marging);
        return this;
    }

    public MVerticalLayout withWidth(String width) {
        setWidth(width);
        return this;
    }

    public MVerticalLayout withFullWidth() {
        setWidth("100%");
        return this;
    }

    public MVerticalLayout withHeight(String height) {
        setHeight(height);
        return this;
    }

    public MVerticalLayout withFullHeight() {
        setHeight("100%");
        return this;
    }

}