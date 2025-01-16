package org.example.estruturais;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    // Configuração para escanear os componentes do pacote org.example
}
