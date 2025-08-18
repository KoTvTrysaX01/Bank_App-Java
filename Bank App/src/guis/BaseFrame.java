package guis;

import javax.swing.*;

public abstract BaseFrame extends JFrame{
    public BaseFrame(String title){
        initialize(title);
    }

    private void initialize(String title){
        setTitle(title);

        setSize(width: 420, height: 600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setResizeable(false);

        setLocationRelativeTo(null);

        addGuiComponents();
    }

    protected abstract void addGuiComponents();
}