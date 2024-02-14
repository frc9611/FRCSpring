package frc.team9611.clients;//package eu.joaorodrigo.vernumdeckspring;

import edu.wpi.first.cscore.CameraServerJNI;
import edu.wpi.first.math.WPIMathJNI;
import edu.wpi.first.networktables.NetworkTablesJNI;
import edu.wpi.first.util.CombinedRuntimeLoader;
import edu.wpi.first.util.WPIUtilJNI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Entrypoint implements CommandLineRunner {

    private static Logger LOG = LoggerFactory
            .getLogger(Entrypoint.class);

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        NetworkTablesJNI.Helper.setExtractOnStaticLoad(false);
        WPIUtilJNI.Helper.setExtractOnStaticLoad(false);
        WPIMathJNI.Helper.setExtractOnStaticLoad(false);
        CameraServerJNI.Helper.setExtractOnStaticLoad(false);

        CombinedRuntimeLoader.loadLibraries(Entrypoint.class, "wpiutiljni", "wpimathjni", "ntcorejni",
                "cscorejnicvstatic");
    }
}
