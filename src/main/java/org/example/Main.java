package org.example;

import org.example.estruturais.AppConfig;
import org.example.estruturais.ConfigManager;
import org.example.estruturais.DatabaseConnection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

    private final ConfigManager conn1;
    private final ConfigManager conn2;

    public Main(ConfigManager conn1, ConfigManager conn2) {
        this.conn1 = conn1;
        this.conn2 = conn2;
    }

    public void run() {
        System.out.println("Conexão 1 ID: " + conn1.getConnectionId());
        System.out.println("Conexão 2 ID: " + conn2.getConnectionId());
        System.out.println("conn1 == conn2: " + (conn1 == conn2));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Main main = context.getBean(Main.class);
        main.run();

        context.close();
    }
}
