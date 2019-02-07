package sky.one.pc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"sky.one"})
public class PcWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(PcWebApplication.class, args);
    }
}

