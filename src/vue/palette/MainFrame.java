package vue.palette;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;





public class MainFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    public static final String FRAME_NAME = "Hesap-eProject";

    public static final int W_FRAME = 1080;
    public static final int H_FRAME = (int) (W_FRAME / ((Math.sqrt(5) + 1) / 2));
    public static final int MENU_BUTTON_WIDTH = 120;
    public static final int MENU_BUTTON_HEIGHT = 60;
    public static Insets INSETS;

    public final int NEW_EMPLOYER_ACTION_COMMAND = 0;
    public final int NEW_WORKER_ACTION_COMMAND = 1;

    private byte activePage = 0;

    private JMenuBar menuBar;
    private JMenu newRecordMenu, addMenu, displayMenu;
    private JMenuItem newEmployerItem, newWorkerItem, newJobItem, newPriceItem;
    private JMenuItem newWorkItem, newWorkerPaymentItem, newEmployerPaymentItem;
    private JMenuItem displayWorkerItem, displayEmployerItem, displayJobItem;


    public MainFrame() {
        this(0);
    }

    public MainFrame(int component) {
        super(FRAME_NAME);
        super.setName("MYFRAME");
        setLayout(null);
        setSize(W_FRAME, H_FRAME);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        activePage = (byte) component;

        INSETS = getInsets();

        GUI();

    }


    private void GUI() {
        createMenus();

        //init();

    }


    private void createMenus() {

        menuBar = new JMenuBar();

        newRecordMenu = new JMenu("Record");
        addMenu = new JMenu("Add");
        displayMenu = new JMenu("Display");


        newJobItem = new JMenuItem("New Job");
        newJobItem.setActionCommand("0");
        newJobItem.addActionListener(this);

        newWorkerItem = new JMenuItem("New worker");
        newWorkerItem.setActionCommand("1");
        newWorkerItem.addActionListener(this);

        newEmployerItem = new JMenuItem("New employer");
        newEmployerItem.setActionCommand("2");
        newEmployerItem.addActionListener(this);

        newPriceItem = new JMenuItem("New price");
        newPriceItem.setActionCommand("3");
        newPriceItem.addActionListener(this);

        newRecordMenu.add(newJobItem);
        newRecordMenu.add(newWorkerItem);
        newRecordMenu.add(newEmployerItem);
        newRecordMenu.add(newPriceItem);


        newWorkerPaymentItem = new JMenuItem("Worker payment");
        newWorkerPaymentItem.setActionCommand("4");
        newWorkerPaymentItem.addActionListener(this);

        newWorkItem = new JMenuItem("Work");
        newWorkItem.setActionCommand("5");
        newWorkItem.addActionListener(this);

        newEmployerPaymentItem = new JMenuItem("Job payment");
        newEmployerPaymentItem.setActionCommand("6");
        newEmployerPaymentItem.addActionListener(this);

        addMenu.add(newWorkerPaymentItem);
        addMenu.add(newWorkItem);
        addMenu.add(newEmployerPaymentItem);


        displayJobItem = new JMenuItem("Display job");
        displayJobItem.setActionCommand("7");
        displayJobItem.addActionListener(this);

        displayWorkerItem = new JMenuItem("Display worker");
        displayWorkerItem.setActionCommand("8");
        displayWorkerItem.addActionListener(this);

        displayEmployerItem = new JMenuItem("Display employer");
        displayEmployerItem.setActionCommand("9");
        displayEmployerItem.addActionListener(this);


        displayMenu.add(displayJobItem);
        displayMenu.add(displayWorkerItem);
        displayMenu.add(displayEmployerItem);

        menuBar.add(newRecordMenu);
        menuBar.add(addMenu);
        menuBar.add(displayMenu);


        this.setJMenuBar(menuBar);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}