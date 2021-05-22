package net.iozhukov.modulator.launcher.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"net.iozhukov.modulator.module"})
public class LauncherConfiguration {
}
