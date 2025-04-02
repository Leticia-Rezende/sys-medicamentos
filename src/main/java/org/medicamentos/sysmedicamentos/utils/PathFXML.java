package org.medicamentos.sysmedicamentos.utils;

import java.nio.file.Paths;

public class PathFXML {
    public static String pathBase() {
        return Paths.get("src/main/java/org/medicamentos/sysmedicamentos/view").toAbsolutePath().toString();
    }
}

