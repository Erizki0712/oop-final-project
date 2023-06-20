import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JButton buttonDataMobil;
    private JButton buttonDataPeminjaman;
    private JButton buttonDataPengembalian;
    private JButton buttonKeluar;

    public MainMenu() {
        setTitle("Aplikasi Rental Mobil");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JLabel label = new JLabel("Silahkan Anda Pilih Menu Di Bawah ini", 10);
        buttonDataMobil = new JButton("Data Mobil");
        buttonDataPeminjaman = new JButton("Pendataan Peminjaman Mobil");
        buttonDataPengembalian = new JButton("Pendataan Pengembalian Mobil");
        buttonKeluar = new JButton("Keluar");

        panel.add(label);
        panel.add(buttonDataMobil);
        panel.add(buttonDataPeminjaman);
        panel.add(buttonDataPengembalian);
        panel.add(buttonKeluar);

        buttonDataMobil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataMobil dataMobil = new DataMobil();
                dispose();
                dataMobil.setVisible(true);
            }
        });

        buttonDataPeminjaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataPeminjaman dataPeminjaman = new DataPeminjaman();
                dispose();
                dataPeminjaman.setVisible(true);
            }
        });

        buttonDataPengembalian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataPengembalian dataPengembalian = new DataPengembalian();
                dispose();
                dataPengembalian.setVisible(true);
            }
        });

        // Button Keluar
        buttonKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika untuk aksi saat tombol "Keluar" ditekan
                // Misalnya, tampilkan dialog konfirmasi dan tutup program jika dikonfirmasi
                dispose();
            }
        });

        add(panel);
    }
}

