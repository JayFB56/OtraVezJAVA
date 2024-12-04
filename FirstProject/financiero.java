import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class financiero {
 
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Datos Financieros de la Empresa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
 
        // Crear los controles de la interfaz gráfica
        JLabel codigoLabel = new JLabel("Código de la Empresa:");
        JTextField codigoField = new JTextField(20);
 
        JLabel nombreLabel = new JLabel("Nombre del Empleado:");
        JTextField nombreField = new JTextField(20);
 
        JLabel sueldoLabel = new JLabel("Sueldo:");
        JTextField sueldoField = new JTextField(20);
 
        JLabel gastosLabel = new JLabel("Gastos:");
        JTextField gastosField = new JTextField(20);
 
        JLabel horasExtrasLabel = new JLabel("Horas Extras:");
        JTextField horasExtrasField = new JTextField(20);
 
        JLabel viaticosLabel = new JLabel("Viáticos:");
        JTextField viaticosField = new JTextField(20);
 
        JButton submitButton = new JButton("Enviar Datos");
        JTextArea resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);
 
        // Añadir los controles al marco
        gbc.gridx = 0; gbc.gridy = 0;
        frame.add(codigoLabel, gbc);
        gbc.gridx = 1;
        frame.add(codigoField, gbc);
 
        gbc.gridx = 0; gbc.gridy = 1;
        frame.add(nombreLabel, gbc);
        gbc.gridx = 1;
        frame.add(nombreField, gbc);
 
        gbc.gridx = 0; gbc.gridy = 2;
        frame.add(sueldoLabel, gbc);
        gbc.gridx = 1;
        frame.add(sueldoField, gbc);
 
        gbc.gridx = 0; gbc.gridy = 3;
        frame.add(gastosLabel, gbc);
        gbc.gridx = 1;
        frame.add(gastosField, gbc);
 
        gbc.gridx = 0; gbc.gridy = 4;
        frame.add(horasExtrasLabel, gbc);
        gbc.gridx = 1;
        frame.add(horasExtrasField, gbc);
 
        gbc.gridx = 0; gbc.gridy = 5;
        frame.add(viaticosLabel, gbc);
        gbc.gridx = 1;
        frame.add(viaticosField, gbc);
 
        gbc.gridx = 0; gbc.gridy = 6;
        gbc.gridwidth = 2;
        frame.add(submitButton, gbc);
 
        gbc.gridx = 0; gbc.gridy = 7;
        gbc.gridwidth = 2;
        frame.add(new JScrollPane(resultadoArea), gbc);
 
        // Acción del botón
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = codigoField.getText();
                    String nombreEmpleado = nombreField.getText();
                    double sueldo = Double.parseDouble(sueldoField.getText());
                    double gastos = Double.parseDouble(gastosField.getText());
                    double horasExtras = Double.parseDouble(horasExtrasField.getText());
                    double viaticos = Double.parseDouble(viaticosField.getText());
 
                    double totalGastos = sueldo + horasExtras + viaticos;
                    double balance = totalGastos - gastos;
 
                    String resultado = "Datos Financieros de la Empresa:\n"
                            + "Código de la Empresa: " + codigo + "\n"
                            + "Nombre del Empleado: " + nombreEmpleado + "\n"
                            + "Sueldo: $" + sueldo + "\n"
                            + "Gastos: $" + gastos + "\n"
                            + "Horas Extras: $" + horasExtras + "\n"
                            + "Viáticos: $" + viaticos + "\n"
                            + "Total Ingresos (Sueldo + Horas Extras + Viáticos): $" + totalGastos + "\n"
                            + "Balance Total (Ingresos - Gastos): $" + balance;
 
                    resultadoArea.setText(resultado);
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor ingrese valores numéricos válidos.");
                }
            }
        });
 
        // Mostrar la ventana
        frame.setVisible(true);
    }
}
 