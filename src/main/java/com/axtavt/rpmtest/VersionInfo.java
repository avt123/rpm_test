package com.axtavt.rpmtest;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("version")
@Data
public class VersionInfo {
    private String version;
    private String timestamp;
}
