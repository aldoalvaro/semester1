/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author LAB282
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testing {
    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField resultField;
    private JTextArea historyArea;

    public Testing() {
        frame = new JFrame("Kalkulator Modern");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.decode("#f0f0f0"));

        // Panel untuk input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridBagLayout());
        inputPanel.setBackground(Color.white);
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Angka 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(new JLabel("Angka 1:"), gbc);

        gbc.gridx = 1;
        textField1 = new JTextField(10);
        inputPanel.add(textField1, gbc);

        // Angka 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(new JLabel("Angka 2:"), gbc);

        gbc.gridx = 1;
        textField2 = new JTextField(10);
        inputPanel.add(textField2, gbc);

        // Tombol operasi
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Menggabungkan kolom
        gbc.fill = GridBagConstraints.BOTH;

        JButton tambahButton = createButton("Tambah");
        inputPanel.add(tambahButton, gbc);

        gbc.gridy++;
        JButton kurangButton = createButton("Kurang");
        inputPanel.add(kurangButton, gbc);

        gbc.gridy++;
        JButton kaliButton = createButton("Kali");
        inputPanel.add(kaliButton, gbc);

        gbc.gridy++;
        JButton bagiButton = createButton("Bagi");
        inputPanel.add(bagiButton, gbc);

        // Hasil
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1; // Kembali ke satu kolom
        inputPanel.add(new JLabel("Hasil:"), gbc);

        gbc.gridx = 1;
        resultField = new JTextField(10);
        resultField.setEditable(false);
        inputPanel.add(resultField, gbc);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Panel untuk riwayat
        historyArea = new JTextArea();
        historyArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        scrollPane.setPreferredSize(new Dimension(350, 200));
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set frame visible
        frame.setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.decode("#4CAF50"));
        button.setForeground(Color.white);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.decode("#388E3C")));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate(text);
            }
        });
        return button;
    }

    private void calculate(String operator) {
        try {
            double angka1 = Double.parseDouble(textField1.getText());
            double angka2 = Double.parseDouble(textField2.getText());
            double hasil = 0;

            switch (operator) {
                case "Tambah":
                    hasil = angka1 + angka2;
                    break;
                case "Kurang":
                    hasil = angka1 - angka2;
                    break;
                case "Kali":
                    hasil = angka1 * angka2;
                    break;
                case "Bagi":
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Error: Pembagian dengan nol tidak diperbolehkan.");
                        return;
                    }
                    break;
            }

            resultField.setText(String.valueOf(hasil));
            addHistory(angka1, angka2, operator, hasil);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Error: Masukkan angka yang valid.");
        }
    }

    private void addHistory(double angka1, double angka2, String operator, double hasil) {
        String entry = String.format("%f %s %f = %f\n", angka1, operator, angka2, hasil);
        historyArea.append(entry);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Testing::new);
    }
}







